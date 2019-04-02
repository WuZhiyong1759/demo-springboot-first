package com.example.demospringbootfirst;

import com.example.demospringbootfirst.soapService.CommonService;
import com.example.demospringbootfirst.soapService.SoapPersonService;
import com.example.demospringbootfirst.soapService.impl.SoapPersonServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.xml.ws.Endpoint;
/**
 * @author wuzhiyong
 */

@EnableSwagger2
@SpringBootApplication
@EnableCaching
public class DemoSpringbootFirstApplication {

    @Autowired
    private Bus bus;

    @Autowired
    SoapPersonService soapPersonService;
    @Autowired
    CommonService commonService;
    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootFirstApplication.class, args);
//        //webService发布的wsdl
//        String address = "http://localhost:5300/services/ThirdBayonetService";
//
//        //webService应用的实体类
//
//        SoapPersonServiceImpl hik = new SoapPersonServiceImpl();
//
//        //第一种发布：最简单直接的webService发布,默认使用的是soap1.1
//        //Endpoint.publish(address,hik);
//
//        //第二种发布：使用的是soap1.2,可能会出现报错--Cannot generate WSDL for binding ，原因jar包版本低
//        //Endpoint.create("http://www.w3.org/2003/05/soap/bindings/HTTP/",hik).publish(address);
//
//        //第三种发布：使用的是xsoap1.2,可以处理客户端soap1.2,会出现警告--为指定的绑定生成非标准 WSDL
//        Endpoint.create("http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/",hik).publish(address);

    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, soapPersonService);
        endpoint.publish("/Common/service1");

        return endpoint;
    }
//    @Bean
//    public Endpoint endpoint2() {
//        EndpointImpl endpoint = new EndpointImpl(bus, commonService);
//        endpoint.publish("/Common/service2");
//
//        return endpoint;
//    }
}
