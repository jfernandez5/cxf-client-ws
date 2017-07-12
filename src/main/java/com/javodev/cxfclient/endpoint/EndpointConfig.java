package com.javodev.cxfclient.endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Created by javo on 6/27/17.
 */
@Configuration
public class EndpointConfig {

    @Autowired
    private Bus bus;

    @Bean
    public SOAPWeatherService soapWeatherService() {
        return new SOAPWeatherServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, soapWeatherService());
        endpoint.publish("/gweather");
        return endpoint;
    }
}
