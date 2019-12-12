package com.devinlee.druiddemo.controller;

import com.alibaba.fastjson.JSONArray;
import com.devinlee.druiddemo.mapper.DruidMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DruidController {

    @Autowired
    private DruidMapper druidMapper;

    @GetMapping("/selectOne")
    public JSONArray selectOne(){

        return druidMapper.selectOne();
    }
}
