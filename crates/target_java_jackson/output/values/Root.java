package com.example;


import com.fasterxml.jackson.annotation.JsonCreator;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Map;

/**

 */

public class Root {
    @JsonValue
    private Map<String, String> value;

    public Root() {
    }

    @JsonCreator
    public Root(Map<String, String> value) {
        this.value = value;
    }

    public Map<String, String> getValue() {
        return value;
    }

    public void setValue(Map<String, String> value) {
        this.value = value;
    }
}
