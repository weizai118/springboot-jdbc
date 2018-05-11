package com.gf.entity;

import java.io.Serializable;

/**
 * <p>Title: Account/p>
 * <p>Description: </p>
 * <p>Company: </p>
 * @author  guofu
 * @date    2018/3/29 15:45
 * @version 1.0
 */
public class Account implements Serializable{

    private static final long serialVersionUID = -5318522146746168227L;

    private int id;
    private String name;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( "{\"Account\":{" );
        sb.append( "\"id\":" )
                .append( id );
        sb.append( ",\"name\":\"" )
                .append( name ).append( '\"' );
        sb.append( ",\"money\":" )
                .append( money );
        sb.append( "}}" );
        return sb.toString();
    }
}
