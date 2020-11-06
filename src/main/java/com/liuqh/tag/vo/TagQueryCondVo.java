package com.liuqh.tag.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Map;

@Data
public class TagQueryCondVo implements Serializable {

    @NotNull(message = "用户ID不能为空[userId]")
    private Integer userId;
    @NotBlank(message="查询标签类型不能为空[tagType]")
    private String tagType;
    @NotEmpty(message = "查询条件不能为空[reqParams]")
    private Map<String,String> reqParams;
}
