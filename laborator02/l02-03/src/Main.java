import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

//        citireDinFisier();

        System.out.println("===");

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
        }

        String dayOfWeek = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid day";
        };
        System.out.println(dayOfWeek);

        String dayOfWeek2 = switch (day) {
            case 1 -> {
                System.out.println("this is 1");
                yield "Monday";
            }

            case 2 -> {
                System.out.println("this is 2");
                yield "Tuesday";
            }

            case 3 -> {
                System.out.println("this is 3");
                yield "Wednesday";
            }
            default -> "Invalid day";
        };

        System.out.println(dayOfWeek2);

    }

    public static void citireDinFisier() throws FileNotFoundException {
        String filePath = "/Users/alexionescu/IdeaProjects/paoj-25-26/laborator02/l02-03/src/input.txt";

        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }

    private static void citireDeLaTastatura() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = scanner.nextLine();
        System.out.println(s);

        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println(a);

        System.out.println("Enter the second number:");
        float b = scanner.nextFloat();
        System.out.println(b);
    }
}
