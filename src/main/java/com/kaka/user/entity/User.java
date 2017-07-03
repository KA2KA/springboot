package com.kaka.user.entity;


import javax.persistence.*;

/**
 * Created by Hem on 2017/6/30.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "username")
    private String name;
    @Column(name = "password")
    private String pwd;

    public User() {
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
