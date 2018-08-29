package javase.oop.adv.io.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialize {

    public static void main(String[] args) {
        try {
            FileOutputStream output =
                new FileOutputStream("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\serialize_output.txt");
            ObjectOutputStream objectOutput = new ObjectOutputStream(output);

            Employee e1 = new Employee(101, "Shennawy", 3000.0);
            Employee e2 = new Employee(102, "Karim", 5000.0);
            Employee e3 = new Employee(103, "Medhat", 7000.0);

            objectOutput.writeObject(e1);
            objectOutput.writeObject(e2);
            objectOutput.writeObject(e3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
