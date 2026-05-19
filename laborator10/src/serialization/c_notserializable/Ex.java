package serialization.c_notserializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        class Library {
            String name = "Central Library";
        }

//        class Library implements Serializable{
//            String name = "Central Library";
//        }

        class Book implements Serializable {
            private static final long serialVersionUID = 1L;
            String title = "Java Basics";
            // 'transient' fields are skipped during serialization (read back as null/0/false).
            // Without 'transient', writing the Book fails because Library is not Serializable.
            transient Library library = new Library();
        }

        // ByteArrayOutputStream is an in-memory stream useful for testing without writing to disk.
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        try (var out = new ObjectOutputStream(buffer)) {
            out.writeObject(new Book());
        } catch (NotSerializableException e) {
            e.printStackTrace();
        }

        // ObjectInputStream reads objects back from an input stream.
        // We feed it the bytes that were just written.
        try (var in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()))) {
            Book book = (Book) in.readObject();
            System.out.println("title:   " + book.title);
            System.out.println("library: " + book.library); // null, because it was transient
        }
    }
}
