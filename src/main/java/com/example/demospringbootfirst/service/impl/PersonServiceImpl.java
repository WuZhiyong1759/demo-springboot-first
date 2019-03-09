package com.example.demospringbootfirst.service.impl;

import com.example.demospringbootfirst.mapper.PersonMapper;
import com.example.demospringbootfirst.model.Person;
import com.example.demospringbootfirst.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    private PersonMapper personMapper;

    @Override
    public int deleteByPrimaryKey(Integer id){
        return personMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Person record){
        return personMapper.insert(record);
    }

    @Override
    public int insertSelective(Person record){
        return personMapper.insertSelective(record);
    }

    @Override
    public Person selectByPrimaryKey(Integer id){
        return personMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Person record){
        return personMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Person record){
        return personMapper.updateByPrimaryKey(record);
    }

}
