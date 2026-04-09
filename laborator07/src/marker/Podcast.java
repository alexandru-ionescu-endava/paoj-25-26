package marker;

public class Podcast
        implements Downloadable, Cloneable {

    private String name;
    private Genre genre;

    public Podcast(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

//    cloneable este o interfata marker, adica nu contine metode, ci doar semnaleaza ca o clasa care o implementeaza are anumite caracteristici sau comportamente.
//    In cazul cloneable, semnaleaza ca o clasa care o implementeaza poate fi clonata folosind metoda clone() din Object.
//    Daca o clasa nu implementeaza Cloneable, atunci apelarea metodei clone() va arunca o exceptie CloneNotSupportedException.
    @Override
    public Podcast clone() throws CloneNotSupportedException {
        Podcast podcast =  (Podcast) super.clone();
        podcast.setGenre((Genre) podcast.getGenre().clone());

        return  podcast;
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                '}';
    }
}
