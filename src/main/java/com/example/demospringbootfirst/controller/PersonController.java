package com.example.demospringbootfirst.controller;

import com.example.demospringbootfirst.model.Person;
import com.example.demospringbootfirst.service.PersonService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@RestController
@EnableAutoConfiguration
public class PersonController {
    @Resource
    PersonService personService;

    @GetMapping("person/{id}")
    public Person getPersonById(@PathVariable("id") Integer id){
        return personService.selectByPrimaryKey(id);
    }
    @ApiOperation(value="更新信息", notes="根据传入的对象更新用户信息")
    @PutMapping("person")
    public Object updatePerson(@RequestBody Person person){
        personService.updateByPrimaryKeySelective(person);
        Map result = new HashMap(2);
        result.put("code",200);
        result.put("msg","success");
        return result;
    }
    @PostMapping("person")
    public Object addPerson(@RequestBody Person person){
        personService.insert(person);
        Map result = new HashMap(2);
        result.put("code",200);
        result.put("msg","success");
        return result;
    }
    @DeleteMapping("person/{id}")
    public Object removePersonById(@PathVariable("id") Integer id){
        personService.deleteByPrimaryKey(id);
        Map result = new HashMap(2);
        result.put("code",200);
        result.put("msg","success");
        return result;
    }
}
