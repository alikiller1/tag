package com.liuqh.tag.aop;

import com.alibaba.fastjson.JSON;
import com.liuqh.tag.entity.TagQueryLog;
import com.liuqh.tag.service.TagQueryLogService;
import com.liuqh.tag.vo.QueryResult;
import com.liuqh.tag.vo.ResultObject;
import com.liuqh.tag.vo.TagQueryCondVo;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Slf4j
@Aspect//标记类为Aspect类
@Component//引入到Spring容器中
public class QueryLogAspect {

    @Autowired
    private TagQueryLogService tagQueryLogService;

    @Pointcut("@annotation(com.liuqh.tag.aop.QueryLog)")
    public void operateLog(){
    }

    @AfterReturning(pointcut="operateLog()",returning = "returnObject")
    public void afterReturning(JoinPoint joinPoint, Object returnObject) {
        ResultObject resultObject= (ResultObject) returnObject;
        QueryResult r= (QueryResult) resultObject.getData();
        TagQueryLog tagQueryLog=new TagQueryLog();
        tagQueryLog.setTagType(r.getTagType());
        tagQueryLog.setRetContent(JSON.toJSONString(r.getData()));
        tagQueryLog.setResult(r.getResult());
        tagQueryLog.setReqParams(JSON.toJSONString(r.getReqParams()));
        Object[] args= joinPoint.getArgs();
        TagQueryCondVo cond= (TagQueryCondVo) args[0];
        tagQueryLog.setUserId(cond.getUserId());
        tagQueryLog.setErrorMsg(r.getErrorMsg());
        tagQueryLogService.insert(tagQueryLog);
    }
}