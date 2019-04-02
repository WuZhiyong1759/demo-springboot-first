package com.example.demospringbootfirst.soapService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
/**
 * @ClassName RestTemplateService
 * @Author wuzhiyong
 * @Date 2019/3/10 11:34
 * @Version 1.0
 **/
@Service
public class RestTemplateService {
    @Autowired
    private RestTemplate restTemplate;

    public String get(Integer id){
        return restTemplate.getForObject("http://localhost:8080/user?userId=id",String.class);
    }
}
