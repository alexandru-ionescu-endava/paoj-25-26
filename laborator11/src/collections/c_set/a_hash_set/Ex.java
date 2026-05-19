package collections.c_set.a_hash_set;

import java.util.HashSet;
import java.util.Set;

public class Ex {
    public static void main(String[] args) {

        // HashSet - no duplicates, NO ordering guarantees
        //   add/contains/remove: O(1) average (depends on hashCode quality)

        Set<String> recipients = new HashSet<>();

        // how does add work?
        //  1. compute hashCode of the element to determine bucket
        //  2. if bucket is empty, add element
        //  3. if bucket is not empty, check for equality with existing elements to prevent duplicates
        recipients.add("alice@example.com");
        recipients.add("bob@example.com");
        recipients.add("alice@example.com");
        recipients.add("carol@example.com");
        recipients.add("bob@example.com");

        System.out.println("recipients (deduped) = " + recipients);
        System.out.println("unique count         = " + recipients.size());
        System.out.println("contains bob         = " + recipients.contains("bob@example.com"));

        recipients.remove("carol@example.com");
        System.out.println("after unsubscribe    = " + recipients);

        record Email(String address) {
        }

        Email email = new Email("test@yahoo.com");
        System.out.println(email.hashCode());

    }
}
