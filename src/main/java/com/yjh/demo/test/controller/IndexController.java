package com.yjh.demo.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * 索引模块
 *
 * @author YJH
 * @Description: 索引模块
 * @Date 2023年06月27日 18:03
 * </p>
 * All rights Reserved, Designed By
 * @Copyright: 2021-2023
 */
@RestController
@RequestMapping(value = "/index/")
public class IndexController {


    /**
     * 根据Id获取索引信息
     *
     * @param id 主键信息
     * @return 返回索引信息
     */
    @GetMapping(value = "get/{id}")
    public String get(@PathVariable(value = "id") Serializable id) {
        return "index" + id;
    }
}
