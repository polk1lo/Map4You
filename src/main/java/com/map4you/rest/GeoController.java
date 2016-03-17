package com.map4you.rest;

import com.map4you.entity.GeoPoint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

@RestController
public class GeoController {

    /**
     * Return all Geo Points for concrete user ID
     *
     * @param userId its User ID
     * @return all points for user in JSON format
     */
    @RequestMapping("/points")
    public Collection<GeoPoint> getGeoPoints(@RequestParam(value = "userId") BigInteger userId) {
        //TODO find all points for user and return
        return Arrays.asList(new GeoPoint(userId, new Long("24"), new Long("155")),
                new GeoPoint(userId, new Long("24"), new Long("155")),
                new GeoPoint(userId, new Long("24"), new Long("155")));
    }

}
