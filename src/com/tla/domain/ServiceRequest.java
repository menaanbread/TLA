package com.tla.domain;

/**
 * Created by tommydomm123 on 06/01/2016.
 */
public class ServiceRequest {

    private double lattitude;
    private double longitude;
    private int resultSetSize;

    public ServiceRequest() {
        lattitude = 0;
        longitude = 0;
        resultSetSize = 0;
    }

    public ServiceRequest(int lattitude, int longitude, int resultSetSize) {
        this.lattitude = lattitude;
        this.longitude = longitude;
        this.resultSetSize = resultSetSize;
    }

    /** Getters and setters */
    public double getLattitude() {
        return lattitude;
    }

    public void setLattitude(int lattitude) {
        this.lattitude = lattitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getResultSetSize() {
        return resultSetSize;
    }

    public void setResultSetSize(int resultSetSize) {
        this.resultSetSize = resultSetSize;
    }
}
