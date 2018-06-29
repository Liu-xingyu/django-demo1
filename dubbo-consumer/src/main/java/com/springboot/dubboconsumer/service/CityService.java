package com.springboot.dubboconsumer.service;

import com.springboot.dubboconsumer.domain.City;

/**
 * @AUTHOR Yrp
 * @CREATE 2018-05-31
 * 12:00
 **/
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     */
    City findCityByName(String cityName);

}
