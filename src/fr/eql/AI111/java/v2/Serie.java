package fr.eql.AI111.java.v2;



public abstract class  Serie {

    private String title;
    private int releaseYear;
    private String synopsis;


    public Serie(String title, int releaseDate, String synopsis) {
        this.title = title;
        this.releaseYear = releaseDate;
        this.synopsis = synopsis;
    }

    public  void  displayAllInfo(){

        displayInfoByLabel("title");
        displayInfoByLabel("release year");
        displayInfoByLabel("synopsis");


    }

    public void displayInfoByLabel(String label){

        switch (label) {
            case "title":
                System.out.println("Le titre de la série est : " + title);
                break;
            case "release year":
                System.out.println("L'année de sortie de la série est : " + releaseYear);
                break;
            case "synopsis":
                System.out.println("Le synopsis de la série est : " + synopsis);
                break;
            default:
                System.out.println("Aucun item ne correspond à ce label.");

        }

    }

    public abstract void displayByWriter(String writer);

}





