package B.files;

import java.io.File;
import java.io.IOException;

public class Ex {

    public static void main(String[] args) throws IOException {
        String path = "data/files";

        File dir = new File(path);
        boolean hasCreated = dir.mkdirs();

        System.out.println(hasCreated);
        System.out.println(dir.exists());
        System.out.println(dir.isFile());
        System.out.println(dir.isDirectory());
        System.out.println(dir.canRead());
        System.out.println(dir.canWrite());
        System.out.println(dir.getParent());

        File file = new File(dir.getCanonicalFile(), "hello.txt");
        boolean hasCreatedNewFile = file.createNewFile();
        System.out.println(hasCreatedNewFile);
    }

}
