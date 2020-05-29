package com.swufe.library.service;

import com.swufe.library.dao.ClassInfoDao;
import com.swufe.library.pojo.ClassInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassInfoServiceImpl implements ClassInfoService{
    @Autowired
    ClassInfoDao classInfoDao;

    @Override
    public List<ClassInfo> queryAllClass() {
        return classInfoDao.queryAllClass();
    }
}
