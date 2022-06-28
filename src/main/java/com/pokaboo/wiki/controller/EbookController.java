package com.pokaboo.wiki.controller;

import com.pokaboo.wiki.req.EbookQueryReq;
import com.pokaboo.wiki.resp.CommonResp;
import com.pokaboo.wiki.resp.EbookQueryResp;
import com.pokaboo.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookQueryReq ebookQueryReq){
        CommonResp<List<EbookQueryResp>> commonResp = new CommonResp<>();
        List<EbookQueryResp> ebookQueryRespList = ebookService.list(ebookQueryReq);
        commonResp.setContent(ebookQueryRespList);
        int i = 1/0;
        return commonResp;
    }



}
