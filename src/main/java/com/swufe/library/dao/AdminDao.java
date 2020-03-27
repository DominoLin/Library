package com.swufe.library.dao;


import com.swufe.library.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface AdminDao {

    @Select("select * from admin where admin_id = #{admin_id} and password = #{password}")
    Admin getAdmin (int admin_id, String password);
    @Update("update admin set password = #{password} where admin_id = #{admin_id} and telephone = #{telephone}")
    int resetPwd(String telephone, int admin_id, String password);
}
