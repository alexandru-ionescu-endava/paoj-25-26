package abstracte;

public class CheesePizza extends Pizza
        implements Comparable<Pizza> {

    @Override
    public int compareTo(Pizza o) {
        return this.getSauce().compareTo(o.getSauce());
    }

    @Override
    public void prepare() {
        System.out.println("prepare Cheese pizza");
    }
}
