package defaults;

public interface Playable {

    default void play() {
        System.out.println("Default play method: Playing media...");
    }

    static void stop() {
        System.out.println("Static stop method: Stopping media...");
    }
}
