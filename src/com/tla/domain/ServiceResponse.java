package com.tla.domain;

/**
 * Created by tommydomm123 on 06/01/2016.
 */
public class ServiceResponse {

    private String response;

    public ServiceResponse() {
        this.response = "";
    }

    public ServiceResponse(String response) {
        this.response = response;
    }

    /** Getters and setters */

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
