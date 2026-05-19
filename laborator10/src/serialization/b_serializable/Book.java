package serialization.b_serializable;


import java.io.Serializable;

// Serializable is a marker interface (no methods).
public class Book implements Serializable {

    // Pins class version; mismatch on deserialization throws InvalidClassException.
    private static final long serialVersionUID = 1L;

    private final String name;
    private final Author author;

    // 'transient' = skipped during serialization, restored as default (null/0/false).
    private transient String session;



    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
        this.session = "tmp-token-" + System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", session='" + session + '\'' +
                '}';
    }
}