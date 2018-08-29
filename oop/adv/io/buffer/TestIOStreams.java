package javase.oop.adv.io.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIOStreams {

    public static void main(String[] args) {
        FileInputStream input;
        FileOutputStream output;
        BufferedInputStream bufferedInput;
        BufferedOutputStream bufferedOutput;

        try {
            input =
                new FileInputStream("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\imgSRC.jpg");
            output =
                new FileOutputStream("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\imgDest.jpg");

            bufferedInput = new BufferedInputStream(input);
            bufferedOutput = new BufferedOutputStream(output);

            // Size in bytes
            byte[] buffer = new byte[1024];
            int i = 0;

            while ((i = input.read(buffer)) != -1) {
                System.out.println("It works here " + (char) i);
                bufferedOutput.write(buffer, 0, i);
            }

            // For an image
           
           
            bufferedInput.close();
            bufferedOutput.close();
            input.close();
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

    }

}
