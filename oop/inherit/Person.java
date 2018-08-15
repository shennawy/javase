package javase.oop.inherit;

public abstract class Person {
    private int personId;
    private String personName;
    private double personGrossSalary;
    private String personJob;

    public Person() {
    }

    public Person(int personId, String personName, double personGrossSalary) {
        super();
        this.personId = personId;
        this.personName = personName;
        this.personGrossSalary = personGrossSalary;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonGrossSalary(double personGrossSalary) {
        this.personGrossSalary = personGrossSalary;
    }

    public double getPersonGrossSalary() {
        return personGrossSalary;
    }

    public void setPersonJob(String personJob) {
        this.personJob = personJob;
    }

    public String getPersonJob() {
        return personJob;
    }

    public void printPersonDetails() {
        System.out.println("Person Id: " + personId);
        System.out.println("Person Name: " + personName);
    }

    public abstract double getAnnualNetSalary();
}

