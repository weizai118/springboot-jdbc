package com.gf.service.impl;

import com.gf.dao.IAccountDAO;
import com.gf.entity.Account;
import com.gf.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Title: AccountServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author guofu
 * @version 1.0
 * @date 2018-03-29 16:14
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDAO accountDAO;

    @Override
    public int add(Account account) {
        return accountDAO.add( account );
    }

    @Override
    public int update(Account account) {
        return accountDAO.update( account );
    }

    @Override
    public int delete(int id) {
        return accountDAO.delete( id );
    }

    @Override
    public Account findAccountById(int id) {
        return accountDAO.findAccountById( id );
    }

    @Override
    public List<Account> findAccountList() {
        return accountDAO.findAccountList();
    }
}
