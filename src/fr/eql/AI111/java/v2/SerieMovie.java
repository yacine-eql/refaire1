package fr.eql.AI111.java.v2;

import java.util.ArrayList;
import java.util.List;

public class SerieMovie extends Serie{


    private List<Episode> episodes = new ArrayList<>();


    public SerieMovie(String title, int releaseDate, String synopsis) {
        super(title, releaseDate, synopsis);
    }

    @Override
    public void displayByWriter(String writer) {
        System.out.println("Film écrit par : " + writer);
        for (Episode episode : episodes) {
            if (writer.equals(episode.getWriter())){
                System.out.println("\t" + episode.getTitle());
            }

        }

    }

    public List<Episode> getEpisodes() {
        return episodes;
    }
}
