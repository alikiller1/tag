package com.liuqh.tag.service;

import com.liuqh.tag.entity.UserInfo;

import java.util.List;

/**
 * @author LL
 * @date 2020-11-07
 */
public interface UserInfoService {
    /**
     * 新增用户
     *
     * @param u
     * @return
     */
    UserInfo add(UserInfo u);

    /**
     *添加多个用户
     *
     * @param userInfoList
     */
    void addList(List<UserInfo> userInfoList);
}
