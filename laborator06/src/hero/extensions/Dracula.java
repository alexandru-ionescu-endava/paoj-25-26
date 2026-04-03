package hero.extensions;

public class Dracula
        implements Vampire {

    @Override
    public void drainLife() {
        System.out.println("Dracula is draining life!");
    }

    @Override
    public void destroyWorld() {
        System.out.println("Dracula is destroying the world!");
    }

    @Override
    public void respawn() {
        System.out.println("Dracula is respawning!");
    }

    @Override
    public void threaten() {
        System.out.println("Dracula is threatening!");
    }
}
