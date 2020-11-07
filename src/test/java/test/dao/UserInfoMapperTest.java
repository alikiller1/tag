package test.dao;

import com.liuqh.tag.dao.UserInfoMapper;
import com.liuqh.tag.entity.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseTest;

/**
 * @author LL
 * @date 2020-11-07
 */
@Slf4j
public class UserInfoMapperTest extends BaseTest {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void testInsert(){
        UserInfo u=new UserInfo();
        u.setId(5);
        u.setName("name5");
        int i=userInfoMapper.insert(u);
        log.info("i="+i);
    }

}
