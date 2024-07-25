package com.example.myapplication2;



import android.content.res.Resources;

import java.util.List;

public class AnimeItem {
    private String posterUri;
   private String name;
   private String description;
   private List<SeasonItem>season;

    public AnimeItem(String posterUri, String name, String description, List<SeasonItem> season) {
        this.posterUri = posterUri;
            this.name = name;
        this.description = description;
        this.season = season;
    }

    public String getPosterUri() {
        return posterUri;
    }

    public void setPosterUri(String posterUri) {
        this.posterUri = posterUri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SeasonItem> getSeason() {
        return season;
    }

    public void setSeason(List<SeasonItem> season) {
        this.season = season;
    }
}
