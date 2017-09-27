package com.kaka.utils;

/**
 * Created by wuwanggao on 2017/8/25.
 */
public enum EnumsConstance {
    sex("sex", 0, "男", 1, "女");
    private String name;
    private int value1;
    private int value2;
    private String remark1;
    private String remark2;

    EnumsConstance(String name, int value1, String remark1, int value2, String remark2) {
        this.name = name;
        this.value1 = value1;
        this.value2 = value2;
        this.remark1 = remark1;
        this.remark2 = remark2;
    }

    public int getValue1() {
        return value1;
    }

    public String getRemark1() {
        return remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public int getValue2() {
        return value2;
    }
}
