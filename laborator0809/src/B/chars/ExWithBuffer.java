package B.chars;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ExWithBuffer {
    public static void main(String[] args) throws IOException {

        String path = "data/chars/";
        File dir = new File(path);
        dir.mkdir();

        File file = new File(dir, "chars_stream_buffered.txt");
        file.createNewFile();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 100_000; i++) {
                bufferedWriter.write(String.valueOf(new Random().nextDouble()));
                bufferedWriter.newLine();
            }
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }

    }
}