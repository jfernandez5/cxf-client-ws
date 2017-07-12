package com.javodev.cxfclient.endpoint;

import com.javodev.cxfclient.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

/**
 * Created by javo on 6/27/17.
 */
@WebService(endpointInterface = "com.javodev.cxfclient.endpoint.SOAPWeatherService")
public class SOAPWeatherServiceImpl implements SOAPWeatherService {

    @Autowired
    WeatherService weatherService;

    @Override
    public String getCitiesByCountry(String name) {
        return weatherService.getCitiesByCountry(name);
    }
}
