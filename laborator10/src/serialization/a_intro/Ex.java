package serialization.a_intro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex {

    record Book(String title, String author, double price) {
    }

    public static void main(String[] args) {

        File dir = new File("data");
        dir.mkdir();

        File file = new File(dir, "book.txt");

        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(book.title());
            bufferedWriter.newLine();

            bufferedWriter.write(book.author());
            bufferedWriter.newLine();

            bufferedWriter.write(String.valueOf(book.price()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Book readBook = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String title = bufferedReader.readLine();
            String author = bufferedReader.readLine();
            double price = Double.parseDouble(bufferedReader.readLine());

            readBook = new Book(title, author, price);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Original Book: " + book);
        System.out.println("Read Book: " + readBook);

        // Problems: format must be kept in sync, manual parsing, fragile (newlines break it),
        // doesn't scale to complex/nested objects.
    }
}
