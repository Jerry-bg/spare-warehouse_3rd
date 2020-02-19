package com.kons.controller;

import com.alibaba.fastjson.JSON;
import com.kons.crawler.config.GlobalConfig;
import com.kons.crawler.handler.Crawler;
import com.kons.json.HeroModel;
import com.kons.repository.IHeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/data")
public class DataHandler {

    static {
        try {
            Class.forName("com.kons.crawler.config.GlobalConfig");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    private IHeroMapper heroMapper;

    @GetMapping("/init")
    public String init() throws IOException {
        if(GlobalConfig.configMap.isEmpty()){
            return "data init error.";
        }
        String url=GlobalConfig.configMap.get("url_hero_list");
        try {
            String page = Crawler.start(url, null);
            HeroModel heroModel= JSON.parseObject(page,HeroModel.class);
            heroMapper.saveAll(heroModel.getHero());
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    @GetMapping("/initGame")
    public String initGame(){
        if(GlobalConfig.configMap.isEmpty()){
            return "data init error.";
        }
        String url=GlobalConfig.configMap.get("url_game_list");
        String cookie=GlobalConfig.configMap.get("cookie_lol");
        try {
            String page=Crawler.start(url,cookie);
            return page;
        }catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    @GetMapping("/initGameDel")
    public String initGameDel(){
        if(GlobalConfig.configMap.isEmpty()){
            return "data init error.";
        }
        String url=GlobalConfig.configMap.get("url_game_detial");
        try{
            String page=Crawler.start(url,null);
            return page;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }
}
