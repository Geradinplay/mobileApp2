package com.example.myapplication2;


import java.util.List;

public class UserObject {
    List<AnimeItem>anime;

    public UserObject(List<AnimeItem> anime) {
        this.anime = anime;
    }

    public List<AnimeItem> getAnime() {
        return anime;
    }

    public void setAnime(List<AnimeItem> anime) {
        this.anime = anime;
    }
}
