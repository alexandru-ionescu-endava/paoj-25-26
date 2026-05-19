package collections.a_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Ex {
    public static void main(String[] args) {

        // Collection - root interface for List, Set, Queue (single-element ops)

        Collection<String> cart = new ArrayList<>();

        Collection<String> s = new HashSet<>();

        cart.add("Headphones");
        cart.add("Mug");
        cart.add("Keyboard");

        System.out.println(cart.size());
        System.out.println(cart.isEmpty());
        System.out.println(cart.contains("Keyboard"));

        cart.remove("Mug");
        System.out.println(cart);

        Collection<String> wishlist = new ArrayList<>();
        wishlist.add("Speaker");
        wishlist.add("USB-C Hub");

        cart.addAll(wishlist);
        System.out.println("after addAll(wishlist) = " + cart);

        cart.clear();
        System.out.println(cart.size());
    }
}
