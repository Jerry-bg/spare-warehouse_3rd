package com.kons.repository;

import com.kons.entity.HeroInfo;

import java.util.List;

public interface IHeroMapper {

    HeroInfo findById(int id);

    List<HeroInfo> findAll();

    void saveOrUpdate(HeroInfo heroInfo);

    void saveAll(List<HeroInfo> list);
}
