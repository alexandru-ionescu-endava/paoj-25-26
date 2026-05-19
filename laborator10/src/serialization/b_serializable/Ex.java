package serialization.b_serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex {
    public static void main(String[] args) {
        new File("data").mkdirs();

        Book original = new Book(
                "The Great Gatsby",
                new Author("F. Scott Fitzgerald")
        );

        System.out.println("before serialization: " + original);

        // serialize = convert object to byte stream
//        try (var out = new ObjectOutputStream(new FileOutputStream("data/book.ser"))) {
//            // .ser is a common extension for serialized files, but it is not mandatory, you can use any extension you want
//            out.writeObject(original);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        // deserialize = convert byte stream back to object
        Book deserialized = null;
        try (var in = new ObjectInputStream(new FileInputStream("data/book.ser"))) {
            deserialized = (Book) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("after deserialization: " + deserialized);
        // session is null: transient fields aren't serialized.
    }
}
