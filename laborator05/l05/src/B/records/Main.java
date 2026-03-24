package B.records;

public class Main {

    public static void main(String[] args) {

        Game g = new Game(
                "The Witcher 3",
                "RPG"
        );
        System.out.println(g.genre());
        System.out.println(g.name());
        g.printInfo();

        Game game = new Game();
        System.out.println(game.name());
        System.out.println(game.genre());
        game.printInfo();

    }
}
