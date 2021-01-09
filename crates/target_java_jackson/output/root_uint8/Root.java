package com.example;


import com.fasterxml.jackson.annotation.JsonCreator;

import com.fasterxml.jackson.annotation.JsonValue;

/**

 */

public class Root {
    @JsonValue
    private UnsignedByte value;

    public Root() {
    }

    @JsonCreator
    public Root(UnsignedByte value) {
        this.value = value;
    }

    public UnsignedByte getValue() {
        return value;
    }

    public void setValue(UnsignedByte value) {
        this.value = value;
    }
}
