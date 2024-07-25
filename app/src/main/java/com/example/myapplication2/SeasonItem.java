package com.example.myapplication2;

import java.util.Map;

public class SeasonItem {
    private Map<String, String> series;
    private int ofSeason;

    public SeasonItem(Map<String, String> series, int ofSeason) {
        this.series = series;
        this.ofSeason = ofSeason;
    }

    public Map<String, String> getSeries() {
        return series;
    }

    public void setSeries(Map<String, String> series) {
        this.series = series;
    }

    public int getOfSeason() {
        return ofSeason;
    }

    public void setOfSeason(int ofSeason) {
        this.ofSeason = ofSeason;
    }
}
