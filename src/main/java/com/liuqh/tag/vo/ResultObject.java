package com.liuqh.tag.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResultObject implements Serializable {

    /**0-成功，1-失败*/
    private int code=0;
    private String msg="成功";
    private Object data;


    public static ResultObject success(){
        return new ResultObject();
    }

    public static ResultObject success(Object data){
        return new ResultObject(0,"成功",data);
    }

    public static ResultObject fail(){
        ResultObject r=new ResultObject(1,"失败",null);
        return r;
    }
    public static ResultObject fail(String msg){
        ResultObject r=new ResultObject(1,msg,null);
        return r;
    }
}
