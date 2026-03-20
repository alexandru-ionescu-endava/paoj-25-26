package abstracte;

public class ClassicPizza
        extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Classic");
    }
}
