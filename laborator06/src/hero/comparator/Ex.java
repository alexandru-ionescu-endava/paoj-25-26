package hero.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Ex {

    public static void main(String[] args) {

        Comparator<Villain> byName = new Comparator<Villain>() {
            @Override
            public int compare(Villain o1, Villain o2) {
                return o1.name().compareTo(o2.name());
            }
        };

        Comparator<Villain> byPowerLevel = new Comparator<Villain>() {
            @Override
            public int compare(Villain o1, Villain o2) {
                return Integer.compare(o1.powerLevel(), o2.powerLevel());
            }
        };

        Villain[] villains = {
                new Villain("Lex Luthor", 124),
                new Villain("Joker", 2),
                new Villain("Cheetah", 5312)
        };

        System.out.println(Arrays.deepToString(villains));

        Arrays.sort(villains, byName);
        System.out.println(Arrays.deepToString(villains));

        Arrays.sort(villains, byPowerLevel);
        System.out.println(Arrays.deepToString(villains));

    }
}
