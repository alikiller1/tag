package com.liuqh.tag.dao;


import com.liuqh.tag.entity.IdstTag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IdstTagMapper{
    @Select("select * from idst_tag where cmp_nm=#{cmpNm} limit 1")
    IdstTag selectByCmpNm(@Param("cmpNm") String cmpNm);

}
