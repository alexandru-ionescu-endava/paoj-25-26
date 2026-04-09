package diamond;

public interface Visual {

    default void prepare() {
        System.out.println("Preparing visuals...");
    }

}
