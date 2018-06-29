package com.springboot.dubboprovider.service;

import com.springboot.dubboprovider.domain.City;

/**
 * @AUTHOR Yrp
 * @CREATE 2018-05-29
 * 09:29
 **/
public interface CityService {

    /**
     * find city by name
     * @param cityName
     * @return
     */
    City findCityByName(String cityName);
}
