package com.kaka.user.entity;


import javax.persistence.*;

/**
 * Created by Hem on 2017/6/30.
 */
@Entity
public class Users {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String username;
    @Column
    private String password;

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
