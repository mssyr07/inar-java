package week_10.assignments;

public class CourseTest_10_09 {
    public static void main(String[] args) {


        Course_10_09 course = new Course_10_09("Mathematics");

        course.addStudents("Özgür Kartal");
        course.addStudents("Bilal Topal");
        course.addStudents("Ada Kaya");
        course.addStudents("Besim Karabıyık");
        course.addStudents("Emir Uyanık");

        String[] students = course.getStudents();

        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
        System.out.println("-----------------------");
        course.dropStudent("Bilal Topal");
        course.dropStudent("Emir Uyanık");
        System.out.println();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
        System.out.println("-----------------------");
    }
}
