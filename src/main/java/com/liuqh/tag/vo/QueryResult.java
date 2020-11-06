package com.liuqh.tag.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class QueryResult implements Serializable {

    /**标签类型*/
    private String tagType;
    /**查询条件*/
    private Map<String,String> reqParams;

    /**查询结果,0-查得，1-查询异常，2-未查得*/
    private Integer result;
    /**查询结果数据对象*/
    private Object data;
    /**错误信息*/
    private String errorMsg;
}
