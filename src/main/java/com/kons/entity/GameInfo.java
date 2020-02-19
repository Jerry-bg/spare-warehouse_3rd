package com.kons.entity;

public class GameInfo {
    private String gameId;
    private long timestamp;
    private int teamWinId;
    private long gameStartTimestamp;

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
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
