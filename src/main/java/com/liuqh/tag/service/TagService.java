package com.liuqh.tag.service;

import com.liuqh.tag.vo.QueryResult;
import com.liuqh.tag.vo.TagQueryCondVo;

public interface TagService {
    QueryResult query(TagQueryCondVo vo)throws Exception;
}
