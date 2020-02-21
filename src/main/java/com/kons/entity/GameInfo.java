package com.kons.entity;

import java.util.Date;

public class GameInfo {
    private String gameId;
    private Date timestamp;
    private int teamWinId;
    private long gameStartTimestamp;

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getTeamWinId() {
        return teamWinId;
    }

    public void setTeamWinId(int teamWinId) {
        this.teamWinId = teamWinId;
    }

    public long getGameStartTimestamp() {
        return gameStartTimestamp;
    }

    public void setGameStartTimestamp(long gameStartTimestamp) {
        this.gameStartTimestamp = gameStartTimestamp;
    }
}
