package com.example;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

@JsonSerialize(using = UnsignedByte.Serializer.class)
@JsonDeserialize(using = UnsignedByte.Deserializer.class)
public class UnsignedByte {
    private byte value;

    public UnsignedByte(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    public static class Serializer extends JsonSerializer<UnsignedByte> {
        @Override
        public void serialize(UnsignedByte value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeNumber(Byte.toUnsignedLong(value.getValue()));
        }
    }

    public static class Deserializer extends JsonDeserializer<UnsignedByte> {
        @Override
        public UnsignedByte deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return new UnsignedByte((byte) p.getLongValue());
        }
    }
}
