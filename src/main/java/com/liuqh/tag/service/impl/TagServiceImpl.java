package com.liuqh.tag.service.impl;

import com.liuqh.tag.config.constant.QueryResultEnum;
import com.liuqh.tag.dto.IdstTagDTO;
import com.liuqh.tag.service.IdstTagService;
import com.liuqh.tag.service.TagService;
import com.liuqh.tag.vo.QueryResult;
import com.liuqh.tag.vo.TagQueryCondVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private IdstTagService idstTagService;

    @Override
    public QueryResult query(TagQueryCondVo vo) throws Exception{
        QueryResult r=new QueryResult();
        r.setTagType(vo.getTagType());
        r.setReqParams(vo.getReqParams());
        String tagType=vo.getTagType();
        if("idst".equals(tagType)){
            String cmpNm=vo.getReqParams().get("cmpNm");
            if(StringUtils.isBlank(cmpNm)){
                r.setResult(QueryResultEnum.ERROR.getCode());
                r.setErrorMsg("参数cmpNm不能为空");
                return r;
            }
            IdstTagDTO tag=idstTagService.queryByCmpNm(cmpNm);
            if(tag!=null){
                r.setResult(QueryResultEnum.SUCCESS.getCode());
            }else{
                r.setResult(QueryResultEnum.UN_KNOW.getCode());
            }
            r.setData(tag);
            return r;
        }else{
            throw new Exception("标签类型不存在");
        }
    }
}
