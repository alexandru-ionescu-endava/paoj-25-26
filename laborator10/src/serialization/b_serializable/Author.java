package serialization.b_serializable;

import java.io.Serializable;

// Referenced by Book, so it must also be Serializable (else NotSerializableException).
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}
