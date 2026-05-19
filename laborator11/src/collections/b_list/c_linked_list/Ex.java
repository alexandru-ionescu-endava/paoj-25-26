package collections.b_list.c_linked_list;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Ex {
    public static void main(String[] args) {

        // LinkedList - doubly-linked, also implements Deque
        //   addFirst/addLast/removeFirst/removeLast/push/pop: O(1)
        //   get(i)/random access: O(n)
        // contains: O(n) because we have to traverse the list to find the element

        LinkedList<String> printQueue = new LinkedList<>();
        // linked list is ideal for queues (FIFO) and stacks (LIFO) because of O(1) add/remove at both ends

        printQueue.add("report.pdf");
        printQueue.add("invoice.pdf");
        printQueue.add("contract.pdf");

        printQueue.addFirst("URGENT-payslip.pdf");
        printQueue.addLast("newsletter.pdf");
        System.out.println("print queue = " + printQueue);

        System.out.println("next to print  = " + printQueue.getFirst());
        System.out.println("last in queue  = " + printQueue.getLast());

        printQueue.removeFirst();
        printQueue.removeLast();
        printQueue.get(1);
        System.out.println("after printing first + cancelling last = " + printQueue);

        printQueue.push("HOTFIX-banner.pdf");
        System.out.println("after pushing hotfix = " + printQueue);
        System.out.println("pop (handle next)    = " + printQueue.pop());
        System.out.println("after pop            = " + printQueue);

    }
}
