// Code generated by jtd-codegen for Java + Jackson v0.1.0

package com.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class Root {
    @JsonValue
    private Boolean value;

    public Root() {
    }

    @JsonCreator
    public Root(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }
}
