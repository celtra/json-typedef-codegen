// Code generated by jtd-codegen for Java + Jackson v0.1.0

package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

/**
 * For type "MultiPoint", the "coordinates" member is an array of
 * positions.
 */
@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeojsonObjectMultiPoint extends GeojsonObject {
    @JsonProperty("coordinates")
    private List<Position> coordinates;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("bbox")
    private BoundingBox bbox;

    public GeojsonObjectMultiPoint() {
    }

    /**
     * Getter for coordinates.<p>
     */
    public List<Position> getCoordinates() {
        return coordinates;
    }

    /**
     * Setter for coordinates.<p>
     */
    public void setCoordinates(List<Position> coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Getter for bbox.<p>
     */
    public BoundingBox getBbox() {
        return bbox;
    }

    /**
     * Setter for bbox.<p>
     */
    public void setBbox(BoundingBox bbox) {
        this.bbox = bbox;
    }
}
