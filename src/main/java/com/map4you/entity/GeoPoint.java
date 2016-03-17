package com.map4you.entity;

import java.math.BigInteger;


/**
 * Representation of GEO Point on the map
 */
public class GeoPoint {

    private BigInteger userId;

    private Long latitude;

    private Long longitude;

    public GeoPoint(BigInteger userId, Long latitude, Long longitude) {
        this.userId = userId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public GeoPoint() {
    }

    public BigInteger getUserId() {
        return userId;
    }

    private void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public Long getLatitude() {
        return latitude;
    }

    private void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    private void setLongitude(Long longitude) {
        this.longitude = longitude;
    }
}
