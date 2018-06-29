package com.springboot.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubboconsumer.domain.City;
import com.springboot.dubboconsumer.service.CityService;
import org.springframework.stereotype.Component;

/**
 * @AUTHOR Yrp
 * @CREATE 2018-05-31
 * 12:26
 **/
@Component
public class CityController {

    @Reference(version = "1.0.0")
    CityService cityService;

    public void printCity() {
        String cityName = "湖北省孝感市";
        String str;
        if (cityService != null) {
            City city = cityService.findCityByName(cityName);
            str = city.toString();
        } else {
            System.err.println("cityService是空指针异常");
            str = cityName;
        }
        System.out.println(str);

    }

}
