package com.liuqh.tag.service.impl;

import com.liuqh.tag.dao.UserInfoMapper;
import com.liuqh.tag.entity.UserInfo;
import com.liuqh.tag.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author LL
 * @date 2020-11-07
 */
@Slf4j
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Transactional
    @Override
    public UserInfo add(UserInfo u) {
        userInfoMapper.insert(u);
        return u;
    }

    /**
     * 测试mycat 是否支持分布式事物，经过测试，得出的结论是支持的
     *
     * @param userInfoList
     */
    @Transactional
    @Override
    public void addList(List<UserInfo> userInfoList) {
        log.info("addList....");
        for(UserInfo u:userInfoList){
            this.add(u);
        }
        int i=1/0;
    }
}
