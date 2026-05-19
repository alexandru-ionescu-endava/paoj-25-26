package collections.d_map.c_tree_map;

import java.util.Comparator;
import java.util.TreeMap;

public class Ex {
    public static void main(String[] args) {

        // TreeMap - keys SORTED (red-black tree)
        //   get/put/remove: O(log n)
        //   firstKey/lastKey/headMap/tailMap/ceilingKey navigate by order
        //   keys must be Comparable OR construct with a Comparator

        TreeMap<Integer, String> leaderboard = new TreeMap<>();
        leaderboard.put(2400, "Alice");
        leaderboard.put(1200, "Bob");
        leaderboard.put(1800, "Carol");
        leaderboard.put(950, "Dave");
        leaderboard.put(2100, "Eve");

        System.out.println("scores (natural order) = " + leaderboard);
        System.out.println("lowest score  = " + leaderboard.firstKey());
        System.out.println("highest score = " + leaderboard.lastKey());
        System.out.println("scores below 1800 = " + leaderboard.headMap(1800));
        System.out.println("scores >= 1800    = " + leaderboard.tailMap(1800));
        System.out.println("lowest score >= 1000 = " + leaderboard.ceilingKey(1000));
    }

}
