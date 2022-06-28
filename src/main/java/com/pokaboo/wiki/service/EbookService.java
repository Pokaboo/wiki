package com.pokaboo.wiki.service;

import com.pokaboo.wiki.domain.Ebook;
import com.pokaboo.wiki.domain.EbookExample;
import com.pokaboo.wiki.mapper.EbookMapper;
import com.pokaboo.wiki.req.EbookQueryReq;
import com.pokaboo.wiki.resp.CommonResp;
import com.pokaboo.wiki.resp.EbookQueryResp;
import com.pokaboo.wiki.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;

    public List<EbookQueryResp> list(EbookQueryReq ebookQueryReq){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria ebookExampleCriteria = ebookExample.createCriteria();
        ebookExampleCriteria.andNameLike("%" +ebookQueryReq.getName()+"%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookQueryResp> ebookQueryRespList = CopyUtil.copyList(ebookList,EbookQueryResp.class);
        return ebookQueryRespList;
    }
}

