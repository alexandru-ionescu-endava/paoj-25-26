package B.bytes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExWithBuffer {
    public static void main(String[] args) throws IOException {

        String path = "data/bytes/";
        File dir = new File(path);
        dir.mkdirs();

        String fileName = "buffered_bytes.bin";
        String copyPath = "copy_buffered_bytes.bin";

        File newFile = new File(dir, fileName);
//
//        .bin format is commonly used for binary files, which can contain any type of data, including images, audio, video, or serialized objects.
//        The .bin extension is a generic extension that indicates the file contains binary data, but it does not specify the exact format or structure of the data within the file.

        // FileOutputStream creates the file if it doesn't exist; explicit createNewFile() is redundant.
        try (FileOutputStream fos = new FileOutputStream(newFile)) {
            fos.write("Hello World !".getBytes());
        }

        File copyFile = new File(dir, copyPath);
        copyFile.createNewFile();


//        BufferedInputStream bis = null;
//        try {
//            bis = new BufferedInputStream(new FileInputStream(newFile));
//        } catch (IOException e) {
        // Handle exceptions
//        } finally {
//            bis.close();
//        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(newFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyFile))) {
//            use chunks
            byte[] buffer = new byte[1024]; // 1 KB buffer
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            // Handle exceptions
        }
    }
}
