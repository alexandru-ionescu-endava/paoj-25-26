package A;

import A.agregare.Periferice;
import A.compozitie.CPU;
import A.compozitie.MotherBoard;
import A.compozitie.RAM;

public class Main {
    public static void main(String[] args) {

        PC pc = new PC(
                new MotherBoard("B560", "ASUS"),
                new CPU("Intel Core i7-11700K"),
                new RAM(32)
        );

        System.out.println(pc);

        Periferice periferice = new Periferice(
                "Logitech",
                "MX Master 3"
        );
        pc.setPeriferice(periferice);
        System.out.println(pc);

        System.out.println(pc.getCpu().getModel());
//        pc = null;

        PC pc2 = new PC(
                new MotherBoard("AB234", "MSI"),
                new CPU(pc.getCpu().getModel()),
                new RAM(16),
                periferice
        );
        System.out.println(pc2);


        System.out.println(pc.getCpu().getModel());
        pc = null;
        pc2 = null;

        System.out.println(periferice);

    }
}
