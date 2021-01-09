package com.example;


import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

/**
 * A GeoJSON object with the type "FeatureCollection" is a
 * FeatureCollection object.  A FeatureCollection object has a member
 * with the name "features".  The value of "features" is a JSON array.
 * Each element of the array is a Feature object as defined above.  It
 * is possible for this array to be empty.
 */

@JsonSerialize

public class GeojsonObjectFeatureCollection extends GeojsonObject {

    
    @JsonProperty("features")
    private List<GeojsonObject> features;


    public GeojsonObjectFeatureCollection() {
    }


    public List<GeojsonObject> getFeatures() {
        return this.features;
    }

    public void setFeatures(List<GeojsonObject> features) {
        this.features = features;
    }

}
