package com.example.demospringbootfirst.service;

import com.example.demospringbootfirst.model.Person;

public interface PersonService{

    public int deleteByPrimaryKey(Integer id);

    public int insert(Person record);

    public int insertSelective(Person record);

    public Person selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(Person record);

    public int updateByPrimaryKey(Person record);
}
