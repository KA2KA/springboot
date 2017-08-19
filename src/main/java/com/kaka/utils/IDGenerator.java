package com.kaka.utils;

/**
 * Created by wuwanggao on 2017/8/11.
 */
public class IDGenerator {


    public static synchronized Long getId() {
        return new IdWorker().getId();
    }

//    public static void main(String[] args) {
//        System.out.println("id:\n"+getId());
//        System.out.println("long max:\n"+Long.MAX_VALUE);
//    }


}
