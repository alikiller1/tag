package com.liuqh.tag.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagQueryLog implements Serializable {
    private Integer userId;
    private String tagType;
    private String reqParams;
    private String retContent;
    private Integer result;
    private String errorMsg;
}
