package com.example;


import com.fasterxml.jackson.annotation.JsonCreator;

import com.fasterxml.jackson.annotation.JsonValue;

/**

 */

public class NullRefNotnullString {
    @JsonValue
    private NotnullString value;

    public NullRefNotnullString() {
    }

    @JsonCreator
    public NullRefNotnullString(NotnullString value) {
        this.value = value;
    }

    public NotnullString getValue() {
        return value;
    }

    public void setValue(NotnullString value) {
        this.value = value;
    }
}
