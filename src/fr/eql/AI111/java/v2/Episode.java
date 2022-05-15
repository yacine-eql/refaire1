package fr.eql.AI111.java.v2;

public class Episode {

    private String title;
    private String writer;

    public Episode(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }

    public String getTitle() {
        return title;
    }
}
