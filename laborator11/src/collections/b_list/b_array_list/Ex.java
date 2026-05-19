package collections.b_list.b_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex {
    public static void main(String[] args) {

        // ArrayList - backed by an array
        // complexity: add/remove at end O(1), add/remove at index O(n), get/set O(1)
        // contains O(n) because we have to scan through the list to find the element

        ArrayList<Integer> dailyTemps = new ArrayList<>();

        int[] readings = {12, 1, 11, 9, 13, 16, 15};
        for (int t : readings) {
            dailyTemps.add(t);
        }

        System.out.println("week temps      = " + dailyTemps);
        System.out.println("wednesday (idx 2) = " + dailyTemps.get(2) + "°C");

        dailyTemps.add(0, 10);
        // complexity: O(n) because we have to shift all existing elements to the right
        System.out.println("after prepend prior-sunday = " + dailyTemps);

        dailyTemps.remove(Integer.valueOf(11));
        System.out.println("after dropping reading 11°C = " + dailyTemps);
        dailyTemps.remove(1);

        System.out.println("contains 16°C  = " + dailyTemps.contains(16));
        System.out.println("number of days = " + dailyTemps.size());

    }
}
