// Code generated by jtd-codegen for Java + Jackson v0.1.0

package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Root {
    @JsonProperty("for")
    private For for_;

    @JsonProperty("object")
    private Object object;

    public Root() {
    }

    /**
     * Getter for for_.<p>
     */
    public For getFor_() {
        return for_;
    }

    /**
     * Setter for for_.<p>
     */
    public void setFor_(For for_) {
        this.for_ = for_;
    }

    /**
     * Getter for object.<p>
     */
    public Object getObject() {
        return object;
    }

    /**
     * Setter for object.<p>
     */
    public void setObject(Object object) {
        this.object = object;
    }
}
