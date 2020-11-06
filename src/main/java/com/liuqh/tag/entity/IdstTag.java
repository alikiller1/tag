package com.liuqh.tag.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class IdstTag implements Serializable {

    private String cmpNm;
    private String idst;
    private Date updateTime;

}
