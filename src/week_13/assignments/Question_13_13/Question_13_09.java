package week_13.assignments.Question_13_13;

public class Question_13_09 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course_10_09 course = new Course_10_09("Deep Copy");

        course.addStudents("Burak");
        course.addStudents("Emre");
        course.addStudents("Furkan");
        course.addStudents("Jack");

        Course_10_09 course2 = course.clone();

        course2.addStudents("Jonny");
        course2.addStudents("Tonny");

        System.out.println("\nNumber of students in course1 :" + course.getNumberOfStudents());
        String[] students1 = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.print(students1[i]);
            if (i < course.getNumberOfStudents() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n---------------------------------------");


        System.out.println("Number of students in course2 :" + course2.getNumberOfStudents());
        String[] students2 = course2.getStudents();
        for (int j = 0; j < course2.getNumberOfStudents(); j++) {
            System.out.print(students2[j]);
            if (j < course2.getNumberOfStudents() - 1) {
                System.out.print(", ");
            }
        }
    }


}
