package com.springboot.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubboprovider.domain.City;
import com.springboot.dubboprovider.service.CityService;

/**
 * @AUTHOR Yrp
 * @CREATE 2018-05-29
 * 09:29
 **/
@Service(version = "1.0.0")
public class CityServiceImpl implements CityService {

    public City findCityByName(String cityName) {
        return new City(1L, 2L, "湖北省孝感市", "我的家乡");
    }

}
