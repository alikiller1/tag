package com.liuqh.tag.dao;

import com.liuqh.tag.entity.TagQueryLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TagQueryLogMapper {

    @Insert("insert into tag_query_log" +
            "(user_id,tag_type,req_params,ret_content,result,error_msg)" +
            "values(#{userId},#{tagType},#{reqParams},#{retContent},#{result},#{errorMsg})")
    int insert(TagQueryLog log);

}
