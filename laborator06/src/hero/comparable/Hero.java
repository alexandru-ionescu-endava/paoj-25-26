package hero.comparable;

public class Hero
        implements Comparable<Hero> {

    private String name;
    private int powerLevel;

    public Hero(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    @Override
    public int compareTo(Hero o) {
        return Integer.compare(this.powerLevel, o.powerLevel);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                '}';
    }
}
