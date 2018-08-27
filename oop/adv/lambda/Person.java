package javase.oop.adv.lambda;

public class Person {
    private int personId;
    private String personFirstName;
    private String personLastName;
    private int personAge;

    public Person(int personId, String personFirstName, String personLastName, int personAge) {
        this.personId = personId;
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.personAge = personAge;
    }


    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public int getPersonAge() {
        return personAge;
    }
}
