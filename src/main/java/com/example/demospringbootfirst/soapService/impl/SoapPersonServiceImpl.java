package com.example.demospringbootfirst.soapService.impl;
import com.example.demospringbootfirst.mapper.PersonMapper;
import com.example.demospringbootfirst.model.Person;
import com.example.demospringbootfirst.soapService.SoapPersonService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 * @ClassName SoapPersonServiceImpl
 * @Author wuzhiyong
 * @Date 2019/3/9 16:42
 * @Version 1.0
 **/
@Service
@WebService(targetNamespace = "http://soapService.demospringbootfirst.example.com/")
public class SoapPersonServiceImpl  implements SoapPersonService {
    @Resource
    PersonMapper personMapper;
    @Override
    public String getPersonById(Integer id) {
        return personMapper.selectByPrimaryKey(id).toString();
    }
}
