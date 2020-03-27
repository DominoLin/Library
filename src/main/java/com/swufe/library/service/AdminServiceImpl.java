package com.swufe.library.service;

import com.swufe.library.dao.AdminDao;
import com.swufe.library.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin getAdmin(int admin_id, String password) {
        return adminDao.getAdmin(admin_id,password);
    }

    @Override
    public int resetPwd(String telephone, int admin_id, String password, String passwordC) {
        if(!password.equals(passwordC)){
            return 0;
        }else {
            return adminDao.resetPwd(telephone, admin_id, password);
        }
    }
}
