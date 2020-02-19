package com.kons.controller;

import com.kons.crawler.config.GlobalConfig;
import com.kons.entity.HeroInfo;
import com.kons.repository.IHeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroInfoHandler {

    @Autowired
    private IHeroMapper heroMapper;

    @GetMapping("/findById/{id}")
    public HeroInfo findById(@PathVariable("id") int id){
        return heroMapper.findById(id);
    }

    @GetMapping("/findAll")
    public List<HeroInfo> findAll(){
        System.out.println(GlobalConfig.configMap.get("url_hero_list"));
        return heroMapper.findAll();
    }
}
