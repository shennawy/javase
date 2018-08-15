package javase.oop.inherit.project;

public class TestProject {

    public static void main(String[] args) {
        Course course = new Course(0000, "Intro to programming", "Technical", 10, 150.0);

        Student s1 = new Student(101, "Mahmoud", "010");
        Student s2 = new Student(102, "Muhammad", "011");
        Student s3 = new Student(103, "Ahmed", "012");

        course.addStudentToCourse(s1);
        course.addStudentToCourse(s2);
        course.addStudentToCourse(s3);
        course.addStudentToCourse(s1);
        course.removeStudentFromCourse(s2);
        
        course.setStudentMarks(s1, 50.5);
        course.setStudentMarks(s2, 40.5);
        course.setStudentMarks(s3, 100.5);
        
        course.setAbsent(s1);
        course.setAbsent(s1);
        course.setAbsent(s3);
        
        course.courseToString();

     

    
        System.out.println("Highest Mark: " + course.getHighestStudentMark().getStudentId());
    }
}
