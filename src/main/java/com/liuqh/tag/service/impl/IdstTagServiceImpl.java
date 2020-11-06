package com.liuqh.tag.service.impl;

import com.liuqh.tag.dao.IdstTagMapper;
import com.liuqh.tag.entity.IdstTag;
import com.liuqh.tag.dto.IdstTagDTO;
import com.liuqh.tag.service.IdstTagService;
import com.liuqh.tag.util.BeanMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdstTagServiceImpl implements IdstTagService {

    @Autowired
    private IdstTagMapper idstTagMapper;

    @Override
    public IdstTagDTO queryByCmpNm(String cmpNm) {
        IdstTag idstTag=idstTagMapper.selectByCmpNm(cmpNm);
        IdstTagDTO vo= BeanMapperUtils.map(idstTag, IdstTagDTO.class);
        return vo;
    }
}
