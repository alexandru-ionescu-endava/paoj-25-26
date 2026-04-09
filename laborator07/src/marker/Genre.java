package marker;

public class Genre
        implements Cloneable {
    private String name;

    public Genre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Genre clone() throws CloneNotSupportedException {
        return (Genre) super.clone();
    }
}
