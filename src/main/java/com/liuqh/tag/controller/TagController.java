package com.liuqh.tag.controller;

import com.liuqh.tag.aop.QueryLog;
import com.liuqh.tag.service.TagService;
import com.liuqh.tag.vo.QueryResult;
import com.liuqh.tag.vo.ResultObject;
import com.liuqh.tag.vo.TagQueryCondVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

@Slf4j
@RestController
public class TagController {

    @Autowired
    private TagService tagService;

    @QueryLog
    @RequestMapping("query")
    public ResultObject test(@Valid @RequestBody TagQueryCondVo vo){
        try {
            log.info("标签查询请求参数:{}",vo);
            ResultObject resultObject = new ResultObject();
            Map<String, String> params = vo.getReqParams();
            QueryResult queryResult=tagService.query(vo);
            resultObject.setData(queryResult);
            log.info("标签查询结果:{}",resultObject);
            return resultObject;
        }catch (Exception  e){
            log.error("标签查询异常-"+e.getMessage(),e);
            return ResultObject.fail(e.getMessage());
        }
    }
}
