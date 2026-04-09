package diamond;

public interface Audible {

    default void prepare() {
        System.out.println("Preparing audio...");
    }


}
