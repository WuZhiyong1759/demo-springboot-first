package com.example.demospringbootfirst.service.impl;

import com.example.demospringbootfirst.mapper.NewsMapper;
import com.example.demospringbootfirst.model.News;
import com.example.demospringbootfirst.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper newsMapper;

    @Override
    public int deleteByPrimaryKey(Long id){
        return newsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(News record){
        return newsMapper.insert(record);
    }

    @Override
    public int insertSelective(News record){
        return newsMapper.insertSelective(record);
    }

    @Override
    public News selectByPrimaryKey(Long id){
        return newsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(News record){
        return newsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(News record){
        return newsMapper.updateByPrimaryKey(record);
    }
}
