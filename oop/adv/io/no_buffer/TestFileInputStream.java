package javase.oop.adv.io.no_buffer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStream {

    public static void main(String[] args) {
        try {
            // Reads bytes
            FileInputStream input =
                new FileInputStream("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\read_file_stream.txt");
            FileOutputStream output =
                new FileOutputStream("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\write_file_stream.txt");

            int i = 0;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Nothing to read");
        }
    }

}
