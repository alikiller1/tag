package test.dao;

import com.alibaba.fastjson.JSON;
import com.liuqh.tag.dao.TagQueryLogMapper;
import com.liuqh.tag.entity.TagQueryLog;
import com.liuqh.tag.dto.IdstTagDTO;
import com.liuqh.tag.vo.QueryResult;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseTest;

import java.util.HashMap;
import java.util.Map;

public class TagQueryLogMapperTest extends BaseTest {
    @Autowired
    private TagQueryLogMapper tagQueryLogMapper;

    @Test
    public void test01(){
        TagQueryLog log=new TagQueryLog();
        log.setUserId(1);
        log.setTagType("idst");
        Map<String,String> reqParams=new HashMap<>();
        reqParams.put("cmpNm","aaa");
        log.setReqParams(JSON.toJSONString(reqParams));
        log.setResult(1);
        QueryResult queryResult=new QueryResult();
        IdstTagDTO vo=new IdstTagDTO();
        vo.setCmpNm("aaa");
        vo.setIdst("房地产");
        queryResult.setData(vo);
        queryResult.setResult(1);
        log.setRetContent(JSON.toJSONString(queryResult));
        tagQueryLogMapper.insert(log);
        System.out.println(log);
    }
}
