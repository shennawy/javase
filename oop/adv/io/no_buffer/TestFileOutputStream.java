package javase.oop.adv.io.no_buffer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream output =
                new FileOutputStream("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\write_file_stream.txt");
            String text = "Welcome to java";
            byte[] textBytesArr = text.getBytes();
            output.write(textBytesArr);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
