package com.pokaboo.wiki.service;

import com.pokaboo.wiki.domain.WikidDemo;
import com.pokaboo.wiki.domain.WikidDemoExample;
import com.pokaboo.wiki.mapper.WikidDemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WikiDemoService {

    @Autowired
    private WikidDemoMapper wikidDemoMapper;

    public List<WikidDemo> findAll(){
        WikidDemoExample wikidDemoExample = new WikidDemoExample();
        WikidDemoExample.Criteria criteria = wikidDemoExample.createCriteria();
        criteria.andNameEqualTo("test");
        return wikidDemoMapper.selectByExample(wikidDemoExample);
    }
}
