package B.siruri;

public class Ex2 {

    public static void main(String[] args) {

        String s = "Hello";
        StringBuilder sb = new StringBuilder(s);
        sb.append(" World");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        concatenareString();
        concatenareStringBuilder();
    }

    private static void concatenareString() {
        long start = System.currentTimeMillis();
        String sir = "a";
        for (int i = 0; i < 100_000; i++) {
            sir += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken with String: " + (end - start) + " ms");
    }

    private static void concatenareStringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 100_000; i++) {
            sb.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (end - start) + " ms");
    }
}
