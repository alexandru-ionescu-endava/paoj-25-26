package hero.extensions;

public class Ex {
    public static void main(String[] args) {
        Dracula dracula = new Dracula();

        dracula.destroyWorld();
        dracula.drainLife();
        dracula.threaten();
        dracula.respawn();

        DangerousVillain d = new Dracula();
        d.destroyWorld();
        d.threaten();

    }
}
