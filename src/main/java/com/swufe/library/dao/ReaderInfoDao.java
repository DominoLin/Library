package com.swufe.library.dao;


import com.swufe.library.pojo.ReaderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper

public interface ReaderInfoDao {
    @Select("select * from reader_info where account = #{account}")
    ReaderInfo getInfo (int account);
}
