package week_11.assignments.Question_11_02;

public class Question_11_02 {
    public static void main(String[] args) {

        Person_11_02 person = new Person_11_02("Gürol","İstanbul","9999999999","gurol@inar.com");

        Student_11_02 student = new Student_11_02("Nafiz","Ankara","3333331133","nafiz@gmail.com",0);

        Employee_11_02 employee = new Employee_11_02("Recai","istanbul","6666666666","recai@inar.com",910,60000);

        Faculty_11_02 faculty = new Faculty_11_02("Serhat","Texas,Dallas","4133333333","serhat@inar.com",101,50000.0,"10 am To 6 pm","manager");

        Staff_11_02 staff = new Staff_11_02("Elon" ,"California","20302222220","elon@musk.com","CEO",12,"6005000.0");


        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
