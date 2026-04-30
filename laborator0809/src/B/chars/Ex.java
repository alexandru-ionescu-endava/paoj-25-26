package B.chars;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Ex {
    public static void main(String[] args) throws IOException {

        File dir = new File("data/chars");
        dir.mkdir();

        File file = new File(dir, "ex1.txt");
        file.createNewFile();

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Hello World");
            fileWriter.write("\n");
            fileWriter.write("Hello World");
        }

        try (FileReader fileReader = new FileReader(file)) {
            int c;
            while ((c = fileReader.read()) != -1) {
//                this while loop reads the file character by character until it reaches the end of the file (indicated by -1)
                System.out.println(c + " " + (char) c);
            }
        }
    }
}
