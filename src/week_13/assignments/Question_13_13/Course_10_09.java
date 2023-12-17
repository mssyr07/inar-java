package week_13.assignments.Question_13_13;

public class Course_10_09 implements Cloneable {
    private String courseName;
    private String[] students = new String[100];

    private int numberOfStudents;

    public Course_10_09(String courseName) {
        this.courseName = courseName;
    }

    public void addStudents(String student) {
        if (numberOfStudents == students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
            temp[numberOfStudents] = student;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (student.equalsIgnoreCase(students[i])) {
                students[i] = "";
                for (int k = i; k < numberOfStudents - 1; k++) {
                    students[k] = students[k + 1];
                }
                students[numberOfStudents - 1] = "";
                numberOfStudents--;
            }

        }
    }

    public int findTheSpecifiedStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (student.equals((students[i]))) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        students = new String[1];
        numberOfStudents = 0;
    }

    public Course_10_09 clone() throws CloneNotSupportedException {
        Course_10_09 course = (Course_10_09) super.clone();
        return course;
    }
}
