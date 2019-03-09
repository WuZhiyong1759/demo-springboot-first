package com.example.demospringbootfirst.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.demospringbootfirst.model.News;
import com.example.demospringbootfirst.mapper.NewsMapper;
public interface NewsService{

    public int deleteByPrimaryKey(Long id);

    public int insert(News record);

    public int insertSelective(News record);

    public News selectByPrimaryKey(Long id);

    public int updateByPrimaryKeySelective(News record);

    public int updateByPrimaryKey(News record);
}
