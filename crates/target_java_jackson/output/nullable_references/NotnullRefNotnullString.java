package com.example;


import com.fasterxml.jackson.annotation.JsonCreator;

import com.fasterxml.jackson.annotation.JsonValue;

/**

 */

public class NotnullRefNotnullString {
    @JsonValue
    private NotnullString value;

    public NotnullRefNotnullString() {
    }

    @JsonCreator
    public NotnullRefNotnullString(NotnullString value) {
        this.value = value;
    }

    public NotnullString getValue() {
        return value;
    }

    public void setValue(NotnullString value) {
        this.value = value;
    }
}
