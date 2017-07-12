package com.javodev.cxfclient.service;

import net.webservicex.GlobalWeatherSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by javo on 7/12/17.
 */
@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    GlobalWeatherSoap globalWeatherSoap;

    @Override
    public String getCitiesByCountry(String name) {
        return globalWeatherSoap.getCitiesByCountry(name);
    }
}
