package com.kons.entity;

import java.io.Serializable;

public class HeroInfo implements Serializable {
    private static final long serialVersionUID = 1435515995276255188L;

    private int heroId;
    private String name;
    private String alias;
    private String title;

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
