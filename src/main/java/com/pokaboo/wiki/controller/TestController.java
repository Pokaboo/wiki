package com.pokaboo.wiki.controller;

import com.pokaboo.wiki.domain.WikiTest;
import com.pokaboo.wiki.service.WikiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private WikiTestService wikiTestService;

    @GetMapping("/test/findWiki")
    public WikiTest hello(){
        System.out.println("123");
        return wikiTestService.findWikiTest();
    }
}
