package fr.eql.AI111.java.v2;

import java.util.ArrayList;
import java.util.List;

public class SerieTv extends Serie{

    private List<Season> seasons = new ArrayList<>();



    public SerieTv(String title, int releaseDate, String synopsis) {
        super(title, releaseDate, synopsis);
    }

    public void displayByWriter(String writer){


        System.out.println("Episodes écrits par " + writer);
        for (Season season : seasons) {
            System.out.println("\tSeason :" + season.getSeasonNumber());
            List<Episode> episodes = season.getEpisodes();
            for (Episode episode : episodes) {
                if (writer.equals(episode.getWriter())){
                    System.out.println("\t\t" + episode.getTitle());
                }

            }
        }

    }

    public List<Season> getSeasons() {
        return seasons;
    }
}
