package com.swufe.library.dao;

import com.swufe.library.pojo.ClassInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ClassInfoDao {

    @Select("select * from class_info")
    List<ClassInfo> queryAllClass();

}
