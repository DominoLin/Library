package com.swufe.library.service;

import com.swufe.library.pojo.Lend;

import java.util.Date;
import java.util.List;

public interface LendService {

    List<Lend> queryLendById(int account);

    int addLend(int account, int book_id, String book_name);

    int updateLend(int lend_id);
}
