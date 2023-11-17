package week_11.assignments.Question_11_05_Course;

public class CourseTest_11_05 {
    public static void main(String[] args) {

        Course_Question_11_05 java = new Course_Question_11_05("Java");

        System.out.println("After adding students to the course .. ");

        java.addStudents("Nisanur Altuntaş");
        java.addStudents("Gürkan Serteser");
        java.addStudents("Sinan Çetin");
        java.addStudents("Mehmet Toprak");
        java.addStudents("Sefa Atakul");
        java.addStudents("Musa Denis");
        java.addStudents("Berkan Eriş");

        String[] students = java.getStudents();
        for (int i= 0; i < students.length; i++){
            System.out.println("\n" + students[i]);
        }

        System.out.println("\nNumber of students " + java.getNumberOfStudents());

        System.out.println("______________________");


        System.out.println("\nAfter dropping students from the course .. ");

        java.dropStudents("Sinan Çetin");
        java.dropStudents("Mehmet Toprak");
        java.dropStudents("Berkan Eriş");

        for (int i = 0; i < java.getNumberOfStudents();i++){
            System.out.println("\n" + students[i]);
        }

        System.out.print("\nNumber of students : " + java.getNumberOfStudents());


    }
}
