package test.dao;

import com.liuqh.tag.dao.IdstTagMapper;
import com.liuqh.tag.entity.IdstTag;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseTest;

public class IdstMapperTest extends BaseTest {
    @Autowired
    private IdstTagMapper idstTagMapper;

    @Test
    public void test01(){
       IdstTag result= idstTagMapper.selectByCmpNm("上海寻梦信息技术有限公司");
       System.out.println(result);
    }
}
