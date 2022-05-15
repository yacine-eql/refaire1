package fr.eql.AI111.java.v2;

import java.util.ArrayList;
import java.util.List;

public class Season {

    private int seasonNumber ;
    private List<Episode> episodes = new ArrayList<>();

    public Season(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }
}
