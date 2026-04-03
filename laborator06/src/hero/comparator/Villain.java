package hero.comparator;

public record Villain(String name, int powerLevel) {

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                '}';
    }
}
