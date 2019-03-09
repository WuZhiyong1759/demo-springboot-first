package com.example.demospringbootfirst.soapService;

import com.example.demospringbootfirst.model.Person;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;
/**
 * @name  暴露服务名称
 * @targetNamespace  命名空间,一般是接口的包名倒序
 */
@WebService(name = "SoapPersonService", targetNamespace = "http://soapService.demospringbootfirst.example.com/")
@MTOM(threshold = 1024)
public interface SoapPersonService {
    @WebMethod
    Person getPersonById(Integer id);
}
