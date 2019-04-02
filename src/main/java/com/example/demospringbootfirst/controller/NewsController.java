package com.example.demospringbootfirst.controller;

import com.example.demospringbootfirst.model.News;
import com.example.demospringbootfirst.service.NewsService;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * @author wuzhiyong
 */
@RestController
public class NewsController {
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private NewsService newsService;

    @GetMapping("news/{id}")
    public News getNewsById(@PathVariable("id") long id){
        logger.info("getNewsById method is called params: id="+id);
        return newsService.selectByPrimaryKey(id);
    }

}
