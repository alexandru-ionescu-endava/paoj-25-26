package B.bytes;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex {
    public static void main(String[] args) throws IOException {

        File dir = new File("data/bytes/");
        dir.mkdirs();

        File input = new File(dir,"in.bmp");
        File output = new File(dir,"out.bmp");

        BufferedImage image = new BufferedImage(
                19,
                19,
                BufferedImage.TYPE_INT_RGB
        );

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                if (x % 2 == 0 && y % 2 == 0)
                    image.setRGB(x, y, Color.WHITE.getRGB());
                else
                    image.setRGB(x, y, Color.BLACK.getRGB());
            }
        }

        ImageIO.write(image, "BMP", input);

        try (FileInputStream fis = new FileInputStream(input)) {
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print(b + " ");
            }
        }

        try (FileInputStream fis = new FileInputStream(input);
             FileOutputStream fos = new FileOutputStream(output)) {

            fos.write(fis.readNBytes(54));
            // headerul unui fișier BMP are 54 de bytes, deci citim și scriem acești 54 de bytes fără a le modifica

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(255 - b);
            }
        }

        System.out.println("==== BMP Header ====");
        try (FileInputStream fis = new FileInputStream(input)) {
            byte[] bmpHeader = fis.readNBytes(54);
            System.out.printf("Signature:       %c%c%n", bmpHeader[0], bmpHeader[1]);
            System.out.printf("File size:       %d bytes%n",
                    (bmpHeader[2] & 0xFF) | ((bmpHeader[3] & 0xFF) << 8) |
                            ((bmpHeader[4] & 0xFF) << 16) | ((bmpHeader[5] & 0xFF) << 24));
            System.out.printf("Pixel offset:    %d%n",
                    (bmpHeader[10] & 0xFF) | ((bmpHeader[11] & 0xFF) << 8));
            System.out.printf("Header size:     %d%n",
                    (bmpHeader[14] & 0xFF) | ((bmpHeader[15] & 0xFF) << 8));
            System.out.printf("Width:           %d px%n",
                    (bmpHeader[18] & 0xFF) | ((bmpHeader[19] & 0xFF) << 8));
            System.out.printf("Height:          %d px%n",
                    (bmpHeader[22] & 0xFF) | ((bmpHeader[23] & 0xFF) << 8));
            System.out.printf("Bits per pixel:  %d%n",
                    (bmpHeader[28] & 0xFF) | ((bmpHeader[29] & 0xFF) << 8));
            System.out.printf("Compression:     %d%n",
                    (bmpHeader[30] & 0xFF) | ((bmpHeader[31] & 0xFF) << 8));
            System.out.printf("Image size:      %d bytes%n",
                    (bmpHeader[34] & 0xFF) | ((bmpHeader[35] & 0xFF) << 8) |
                            ((bmpHeader[36] & 0xFF) << 16) | ((bmpHeader[37] & 0xFF) << 24));
        }

    }
}
