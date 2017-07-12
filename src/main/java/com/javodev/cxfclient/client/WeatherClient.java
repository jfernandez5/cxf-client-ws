package com.javodev.cxfclient.client;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

/**
 * Created by javo on 6/27/17.
 */
@Configuration
public class WeatherClient {

    private static final String WSDL = "wsdl/globalweather.wsdl";

    @Bean
    public GlobalWeatherSoap globalWeatherSoap() {
        URL wsdlUrl = getClass().getClassLoader().getResource(WSDL);
        GlobalWeather globalWeather = new GlobalWeather(wsdlUrl);
        GlobalWeatherSoap globalWeatherSoap = globalWeather.getGlobalWeatherSoap();
        return globalWeatherSoap;
    }
}
