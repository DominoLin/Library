package com.swufe.library.service;

import com.swufe.library.pojo.Admin;

public interface AdminService {

    Admin getAdmin(int admin_id, String password);

    int resetPwd(String telephone, int admin_id, String password, String passwordC);
}
