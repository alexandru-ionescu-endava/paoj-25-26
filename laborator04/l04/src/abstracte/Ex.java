package abstracte;

public class Ex {

    public static void main(String[] args) {

        Pizza pizza = new Pizza() {
            @Override
            public void prepare() {
                System.out.println("prepare default pizza");
            }
        };

        pizza.prepare();
        System.out.println(pizza.getClass());

        CheesePizza cheese = new CheesePizza();
        cheese.prepare();
        System.out.println(cheese.getClass());

        Pizza classic = new ClassicPizza();

//        System.out.println(classic < cheese);

//        System.out.println(1 == 1);
        cheese.setSauce("hot");
        classic.setSauce("sweet");
        System.out.println(cheese.compareTo(classic));

    }
}
