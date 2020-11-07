package com.liuqh.tag.dao;

import com.liuqh.tag.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author LL
 * @date 2020-11-07
 */
@Mapper
public interface UserInfoMapper {
    /**
     * 插入
     *
     * @param u
     * @return 插入成功反回1，否则返回0
     */
    @Insert("insert into user_info(id,name) values(#{id},#{name})")
    int insert(UserInfo u);
}
