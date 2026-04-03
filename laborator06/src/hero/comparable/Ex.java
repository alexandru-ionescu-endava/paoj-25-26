package hero.comparable;

import java.util.Arrays;

public class Ex {
    public static void main(String[] args) {

        Hero[] heroes = {
                new Hero("Superman", 124),
                new Hero("Batman", 2),
                new Hero("Wonder Woman", 5312)
        };

        System.out.println(Arrays.deepToString(heroes));
        Arrays.sort(heroes);
        System.out.println(Arrays.deepToString(heroes));

    }
}
