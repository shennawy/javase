package javase.oop.inherit.project;

public class Student {
    private int studentId;
    private String studentName;
    private String studentMobile;
    private double courseMark;
    private int courseAbesntDays;


    public Student() {

    }

    public Student(int studentId, String studentName, String studentMobile) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMobile = studentMobile;
        courseAbesntDays = 0;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getCourseMark() {
        return courseMark;
    }

    public void setCourseMark(double courseMark) {
        this.courseMark = courseMark;
    }

    public void setCourseAbesntDays() {
        courseAbesntDays++;
    }

    public int getCourseAbesntDays() {
        return courseAbesntDays;
    }

}
