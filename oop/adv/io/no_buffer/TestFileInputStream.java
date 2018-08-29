package javase.oop.adv.io.no_buffer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestFileInputStream {

    public static void main(String[] args) {
        try {
            FileInputStream input =
                new FileInputStream("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\read_file_stream.txt");
            FileOutputStream output =
                new FileOutputStream("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\write_file_stream.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

}
