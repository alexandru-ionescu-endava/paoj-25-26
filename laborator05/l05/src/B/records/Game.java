package B.records;

public record Game(String name, String genre) {

    Game() {
        this("Unknown", "Unknown");
    }

    public void printInfo() {
        System.out.println("Game{name='" + name + "', genre='" + genre + "'}");
    }
}
