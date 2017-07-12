package com.javodev.cxfclient.client;

import net.webservicex.GlobalWeatherSoap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by javo on 6/27/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class WeatherClientTest {

    @Autowired
    private GlobalWeatherSoap globalWeatherSoap;

    @Test
    public void shouldGetStringOfCitiesByCountry() {
        String cities = globalWeatherSoap.getCitiesByCountry("pe");
//        System.out.println(cities);
        assertNotNull("cities is null", cities);
    }
}
