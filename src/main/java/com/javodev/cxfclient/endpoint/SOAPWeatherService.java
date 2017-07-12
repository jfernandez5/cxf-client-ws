package com.javodev.cxfclient.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by javo on 6/27/17.
 */
@WebService
public interface SOAPWeatherService {
    @WebMethod
    String getCitiesByCountry(@WebParam(name = "name")String name);
}
