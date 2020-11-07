package test.service;

import com.liuqh.tag.entity.UserInfo;
import com.liuqh.tag.service.UserInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LL
 * @date 2020-11-07
 */
public class UserInfoServiceTest extends BaseTest {
    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void testAdd() {
        UserInfo u1 = new UserInfo();
        u1.setId(5);
        u1.setName("name5");

        UserInfo u2 = new UserInfo();
        u2.setId(6);
        u2.setName("name6");

        List<UserInfo> list = new ArrayList<>(2);
        list.add(u1);
        list.add(u2);
        userInfoService.addList(list);

    }
}
