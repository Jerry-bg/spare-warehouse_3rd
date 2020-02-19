package com.kons.repository;

import com.kons.entity.GameInfo;

import java.util.List;

public interface IGameMapper {

    GameInfo findById(int id);

    List<GameInfo> findAll();

    void saveOrUpdate(GameInfo gameInfo);
}
