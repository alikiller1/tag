package com.liuqh.tag.config.constant;

public enum QueryResultEnum {

    SUCCESS(0,"查得"),
    UN_KNOW(1,"未查得"),
    ERROR(2,"异常");

    private int code;
    private String msg;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    QueryResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
