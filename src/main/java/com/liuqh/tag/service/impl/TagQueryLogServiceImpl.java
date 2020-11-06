package com.liuqh.tag.service.impl;

import com.liuqh.tag.dao.TagQueryLogMapper;
import com.liuqh.tag.entity.TagQueryLog;
import com.liuqh.tag.service.TagQueryLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TagQueryLogServiceImpl implements TagQueryLogService {

    @Autowired
    private TagQueryLogMapper tagQueryLogMapper;

    @Transactional
    @Override
    public int insert(TagQueryLog log) {
        return tagQueryLogMapper.insert(log);
    }
}
