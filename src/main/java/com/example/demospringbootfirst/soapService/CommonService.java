package com.example.demospringbootfirst.soapService;
 import com.example.demospringbootfirst.model.BinaryFile;

 import javax.jws.WebMethod;
 import javax.jws.WebParam;
 import javax.jws.WebResult;
 import javax.jws.WebService;
 import javax.xml.ws.soap.MTOM;

        @WebService(name = "CommonService", // 暴露服务名称
        targetNamespace = "http://service.webservice.mathxhwebservice.com/")// 命名空间,一般是接口的包名倒序
 @MTOM(threshold = 1024)
 public interface CommonService {

     @WebMethod
     @WebResult(name = "String")
     String sayHello(@WebParam(name = "userName") String name);

     @WebMethod
     @WebResult(name ="BinaryFile")
     BinaryFile downloadFile(@WebParam(name = "fileName") String fileName);

     @WebMethod
     @WebResult(name = "boolean")
     boolean uploadFile(@WebParam(name = "file") BinaryFile file);
 }