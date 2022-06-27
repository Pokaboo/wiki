package com.pokaboo.wiki.service;

import com.pokaboo.wiki.domain.WikiTest;
import com.pokaboo.wiki.mapper.WikiTestmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WikiTestService {

    @Autowired
    private WikiTestmapper wikiTestmapper;

    public WikiTest findWikiTest(){
        return  wikiTestmapper.findWikiTest();
    }
}
