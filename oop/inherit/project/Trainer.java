package javase.oop.inherit.project;

import java.util.Date;

public class Trainer {
    private int trainerId;
    private String trainerName;
    private Date trainerHireDate;
    private double trainerSalary;
    
    public Trainer(int trainerId, String trainerName, Date trainerHireDate, double trainerSalary) {
        super();
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.trainerHireDate = trainerHireDate;
        this.trainerSalary = trainerSalary;
    }

    
    public int getTrainerId() {
        return trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public Date getTrainerHireDate() {
        return trainerHireDate;
    }

    public double getTrainerSalary() {
        return trainerSalary;
    }
    

   
}
