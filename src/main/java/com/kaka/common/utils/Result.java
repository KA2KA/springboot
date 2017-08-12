package com.kaka.common.utils;

/**
 * @see Constance#SUCCESS
 * @see Constance#ERROR
 * Created by QIEGAO on 2017/8/12.
 */
public class Result {

    private String message;
    private Object data;
    private boolean resultFlag;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isResultFlag() {
        return resultFlag;
    }

    public void setResultFlag(boolean resultFlag) {
        this.resultFlag = resultFlag;
    }

    public static Result ok() {
        Result result = new Result();
        result.setResultFlag(Constance.SUCCESS);
        return result;
    }

    public static Result ok(Object data) {
        Result result = new Result();
        result.setData(data);
        result.setResultFlag(Constance.SUCCESS);
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.setResultFlag(Constance.ERROR);
        return result;
    }

    public static Result fail(Object data) {
        Result result = new Result();
        result.setData(data);
        result.setResultFlag(Constance.ERROR);
        return result;
    }

    public boolean isSucess() {
        return resultFlag;
    }
}
