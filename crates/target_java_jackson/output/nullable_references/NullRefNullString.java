package com.example;


import com.fasterxml.jackson.annotation.JsonCreator;

import com.fasterxml.jackson.annotation.JsonValue;

/**

 */

public class NullRefNullString {
    @JsonValue
    private NullString value;

    public NullRefNullString() {
    }

    @JsonCreator
    public NullRefNullString(NullString value) {
        this.value = value;
    }

    public NullString getValue() {
        return value;
    }

    public void setValue(NullString value) {
        this.value = value;
    }
}
