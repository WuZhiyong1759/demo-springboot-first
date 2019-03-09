package com.example.demospringbootfirst.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.demospringbootfirst.mapper.PersonMapper;
import com.example.demospringbootfirst.model.Person;

public interface PersonService{

    public int deleteByPrimaryKey(Integer id);

    public int insert(Person record);

    public int insertSelective(Person record);

    public Person selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(Person record);

    public int updateByPrimaryKey(Person record);
}
