package com.kaka.utils;

/**
 * Created by wuwanggao on 2017/8/17.
 */
public class Constance {

    /**
     * 是否
     */
    public static final String STATUS_YES = "0";
    public static final String STATUS_NO = "1";
    public static final int INT_YES = 0;
    public static final int INT_NO = 1;
    /**
     * 系统超级管理员
     */
    public static final String USER_ROOT = "admin";


    public static void main(String[] args) {
        System.out.println(EnumsConstance.sex.getValue1());
        System.out.println(EnumsConstance.sex.getRemark1());
    }

}
