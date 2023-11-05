package service;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService(serviceName="CalculatriceWS")
public class CalculatriceWS {
    @WebMethod(operationName="sommeDouble")
    public double somme(  @WebParam(name="a") double a ,  @WebParam(name="b") double b ){
        return a + b ;
    }
}
