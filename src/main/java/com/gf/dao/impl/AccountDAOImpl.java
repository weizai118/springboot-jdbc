package com.gf.dao.impl;

import com.gf.dao.IAccountDAO;
import com.gf.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>Title: AccountDAOImpl</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author guofu
 * @version 1.0
 * @date 2018-03-29 15:56
 */
@Repository
public class AccountDAOImpl implements IAccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public int add(Account account) {
        return jdbcTemplate.update( "INSERT INTO account(name,money) VALUES (?,?)" , account.getName(),account.getMoney());

    }

    @Override
    public int update(Account account) {
        return jdbcTemplate.update( "UPDATE account SET  name = ? , money = ? WHERE  id = ?" ,   account.getName(),account.getMoney() , account.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update( "DELETE  FROM account WHERE id = ?" , id );
    }

    @Override
    public Account findAccountById(int id) {
        List<Account> list = jdbcTemplate.query( "SELECT * FROM account WHERE id = ?", new Object[]{id}, new BeanPropertyRowMapper<>( Account.class ) );
        if(null != list && 0 < list.size()){
            return list.get( 0 );
        }else{
            return null;
        }
    }

    @Override
    public List<Account> findAccountList() {
        List<Account> list = jdbcTemplate.query( "SELECT * FROM account", new BeanPropertyRowMapper<>( Account.class ) );
        if(null != list && 0 < list.size()){
            return list;
        }else{
            return null;
        }
    }
}
