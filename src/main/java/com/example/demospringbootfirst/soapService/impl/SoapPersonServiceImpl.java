package com.example.demospringbootfirst.soapService.impl;
import com.example.demospringbootfirst.mapper.PersonMapper;
import com.example.demospringbootfirst.model.Person;
import com.example.demospringbootfirst.soapService.SoapPersonService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
/**
 * @ClassName SoapPersonServiceImpl
 * @Author wuzhiyong
 * @Date 2019/3/9 16:42
 * @Version 1.0
 **/
@Service
public class SoapPersonServiceImpl  implements SoapPersonService {
    @Resource
    PersonMapper personMapper;
    @Override
//    @WebMethod(action = "urn:initSystem")
//    @RequestWrapper(localName = "initSystem", targetNamespace = "http://service.thirdBayonet.webservice.bms.hikvision.com")
//    @ResponseWrapper(localName = "initSystemResponse", targetNamespace = "http://service.thirdBayonet.webservice.bms.hikvision.com")
//    @WebResult(name = "return", targetNamespace = "http://service.thirdBayonet.webservice.bms.hikvision.com")
    public Person getPersonById(Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }
}
