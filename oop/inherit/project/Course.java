package javase.oop.inherit.project;

import java.util.ArrayList;
import java.util.Date;

public class Course {
    private int courseId;
    private String courseName;
    private String courseCategory;
    private int courseHours;
    private double coursePrice;

    private Trainer trainer;
    private ArrayList<Student> studentList = new ArrayList<Student>();


    public Course(int courseId, String courseName, String courseCategory, int courseHours, double coursePrice) {
        super();
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCategory = courseCategory;
        this.courseHours = courseHours;
        this.coursePrice = coursePrice;
        Date date = new Date();
        trainer = new Trainer(100, "Muhammad", date, 3000);
    }

    public void addStudentToCourse(Student student) {
        boolean flag = false;
        for (Student index : studentList) {
            if (index.getStudentId() == student.getStudentId()) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            studentList.add(student);
        }
    }

    public void removeStudentFromCourse(Student student) {
        studentList.remove(student);
    }

    public int getAllAbsentDays(Student student) {
        int absentDays = 0;

        for (Student index : studentList) {
            if (index.getStudentId() == student.getStudentId())
                absentDays = index.getCourseAbesntDays();
        }

        return absentDays;
    }

    public void setStudentMarks(Student student, double mark) {

        for (Student index : studentList) {
            if (index.getStudentId() == student.getStudentId()) {
                student.setCourseMark(mark);
            }
        }

    }

    public Student getHighestStudentMark() {

        double maxGrade = 0.0;
        Student highestMark = new Student();
        for (int i = 0; i < studentList.size() ; i++) {

            if (studentList.get(i).getCourseMark() > maxGrade) {
                maxGrade = studentList.get(i).getCourseMark();                
                highestMark = studentList.get(i);

            }
        }

        return highestMark;
    }

    public void setAbsent(Student student) {
        for (Student index : studentList) {
            if (index.getStudentId() == student.getStudentId()) {
                student.setCourseAbesntDays();
            }
        }
    }


    public void courseToString() {

        System.out.println("Traininer name: " + trainer.getTrainerName() + " Trainer Salary: " +
                           trainer.getTrainerSalary() + " Trainer Hiring Date: " + trainer.getTrainerHireDate() +
                           " Course ID: " + courseId + " CourseName: " + courseName + " Course Category: " +
                           courseCategory + " Course Hours: " + courseHours + " coursePrice: " + coursePrice);

        for (Student index : studentList) {
            System.out.println("Student ID: " + index.getStudentId() + " Student Mark: " + index.getCourseMark() +
                               "Student abdesnt days" + index.getCourseAbesntDays());
        }
    }
}
