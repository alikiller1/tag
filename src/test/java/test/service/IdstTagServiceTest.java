package test.service;

import com.liuqh.tag.dto.IdstTagDTO;
import com.liuqh.tag.service.IdstTagService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseTest;

public class IdstTagServiceTest extends BaseTest {

    @Autowired
    private IdstTagService idstTagService;

    @Test
    public void test01(){
        IdstTagDTO dto=idstTagService.queryByCmpNm("上海寻梦信息技术有限公司");
        System.out.println(dto);
    }
}
