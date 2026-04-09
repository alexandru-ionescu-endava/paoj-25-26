package marker;

public class Song
        implements Downloadable, Cloneable {

    private String name;

    public Song(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                '}';
    }
//
//    @Override
//    public Song clone() throws CloneNotSupportedException {
//        return (Song) super.clone();
//    }


    @Override
    public Song clone() throws CloneNotSupportedException {
        return (Song) super.clone();
    }
}
