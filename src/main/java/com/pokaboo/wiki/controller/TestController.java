package com.pokaboo.wiki.controller;

import com.pokaboo.wiki.domain.WikiTest;
import com.pokaboo.wiki.domain.WikidDemo;
import com.pokaboo.wiki.service.WikiDemoService;
import com.pokaboo.wiki.service.WikiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private WikiTestService wikiTestService;

    @Autowired
    private WikiDemoService wikiDemoService;

    @GetMapping("/test/findWiki")
    public WikiTest hello(){
        System.out.println("123");
        return wikiTestService.findWikiTest();
    }

    @GetMapping("/test/findAll")
    public List<WikidDemo> findAll(){
        return wikiDemoService.findAll();
    }
}
