package javase.oop.myclasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFiles {

    public static void main(String[] args) {

        //Read from file
        //FileReader    BufferedReader

        try {
            FileReader fr =
                new FileReader("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\read_file.txt");
            BufferedReader bfr = new BufferedReader(fr);
            String line = bfr.readLine();
            
            FileWriter fwr =
                new FileWriter("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\write_file.txt");
            BufferedWriter bfw = new BufferedWriter(fwr);
            
            while (line != null) {
                
                bfw.write(line);
                bfw.newLine();
                line = bfr.readLine();
              
            }
            
            bfw.flush();
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception");
        } catch (IOException e) {
            System.out.println("BFR exception");
        } /*catch (IOException f) {
            System.out.println("This is a write to file exception");
        }*/
        //Write to file
        //FileWriter    BufferWriter

        /* try {
            FileWriter fr =
                new FileWriter("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\write_file.txt");

            BufferedWriter bfw = new BufferedWriter(fr);
            bfw.write("Hello Oracle");
            bfw.newLine();
            bfw.write("Java is good");

            bfw.flush();
            bfw.close();
            fr.close();
        } catch (IOException f) {
            System.out.println("This is a write to file exception");
        }*/
    }


}

