package week_11.assignments.Question_11_05_Course;


import java.util.ArrayList;

public class Course_Question_11_05 {
    private String courseName;
    private ArrayList<String> students;

    public Course_Question_11_05(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<String>();


    }

    public void addStudents(String student) {
        students.add(student);
    }

    public String[] getStudents() {
        String[] list = new String[students.size()];
        return students.toArray(list);
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void dropStudents(String student) {
        students.remove(student);
    }

}
