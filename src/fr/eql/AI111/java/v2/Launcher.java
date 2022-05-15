package fr.eql.AI111.java.v2;

import java.util.Collections;

public class Launcher {

    public static void main(String[] args) {


        Episode episode1 = new Episode("Nice city", "Robert Noname");
        Episode episode2 = new Episode("Lousy city", "John Coolname");
        Episode episode3 = new Episode("Hello Sue-Hellen", "Robert Noname");
        Episode episode4 = new Episode("Petrol !", "Robert Noname");
        Episode episode5 = new Episode("Houston isn't here", "Suzanne Strange");
        Episode episode6 = new Episode("All the money !", "Mister T");


        Season season1 = new Season(1);

        Collections.addAll(season1.getEpisodes(),episode1,episode2,episode3);

        Season season2 = new Season(2);
        Collections.addAll(season2.getEpisodes(),episode3,episode4,episode5);


        SerieTv serie = new SerieTv(
                "Dallas",
                1978,
                "Un univers impitoyable");

        Collections.addAll(serie.getSeasons(),season1,season2);

        episode4 = new Episode("A new hope", "Georges Lucas");
        episode5 = new Episode("The Empire Strikes Back", "Lawrence Kasdan");
        episode6 = new Episode("Return of the Jedi", "Lawrence Kasdan");

        SerieMovie saga = new SerieMovie(
                "Star Wars",
                1977,
                "A war in the stars");

        Collections.addAll(saga.getEpisodes(),episode4,episode5,episode6);

        serie.displayAllInfo();
        serie.displayInfoByLabel("title");
        serie.displayInfoByLabel("release year");
        serie.displayInfoByLabel("synopsis");
        serie.displayInfoByLabel("toto");
        serie.displayByWriter("Robert Noname");
        serie.displayByWriter("John Coolname");
        serie.displayByWriter("Toto Tutu");
        saga.displayAllInfo();
        saga.displayInfoByLabel("title");
        saga.displayInfoByLabel("release year");
        saga.displayInfoByLabel("synopsis");
        saga.displayInfoByLabel("toto");
        saga.displayByWriter("Georges Lucas");
        saga.displayByWriter("Lawrence Kasdan");
        saga.displayByWriter("Toto Tutu");

    }
}
