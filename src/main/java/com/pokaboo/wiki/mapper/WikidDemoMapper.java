package com.pokaboo.wiki.mapper;

import com.pokaboo.wiki.domain.WikidDemo;
import com.pokaboo.wiki.domain.WikidDemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WikidDemoMapper {
    long countByExample(WikidDemoExample example);

    int deleteByExample(WikidDemoExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(WikidDemo record);

    int insertSelective(WikidDemo record);

    List<WikidDemo> selectByExample(WikidDemoExample example);

    WikidDemo selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") WikidDemo record, @Param("example") WikidDemoExample example);

    int updateByExample(@Param("record") WikidDemo record, @Param("example") WikidDemoExample example);

    int updateByPrimaryKeySelective(WikidDemo record);

    int updateByPrimaryKey(WikidDemo record);
}