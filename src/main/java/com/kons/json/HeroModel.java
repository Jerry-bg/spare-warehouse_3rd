package com.kons.json;

import com.kons.entity.HeroInfo;

import java.util.List;

public class HeroModel {
    private List<HeroInfo> hero;

    public List<HeroInfo> getHero() {
        return hero;
    }

    public void setHero(List<HeroInfo> hero) {
        this.hero = hero;
    }
}
