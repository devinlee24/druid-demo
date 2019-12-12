package com.devinlee.druiddemo.mapper;

import com.alibaba.fastjson.JSONArray;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DruidMapper {

    JSONArray selectOne();
}
