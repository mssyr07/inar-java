package week_11.assignments.Question_11_02;


import week_10.assignments.MyDate_10_14;

public class Employee_11_02 extends Person_11_02 {

    private int office;
    private double salary;

    private MyDate_10_14 dateHired;

    public Employee_11_02(String name,String addres,String phoneNumber,String eMail,int office,double salary){
        super(name,addres,phoneNumber,eMail);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate_10_14();
    }

    public int getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired.getYear() + " " + dateHired.getMonth() + " " + dateHired.getDay();
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired() {
        this.dateHired = new MyDate_10_14();
    }

    @Override
    public String toString() {
        return "_Employee_" + "\n" + super.toString() + "\nOffice : " + getOffice() + "\nSalary : " + getSalary() + "\nDate Hired : " + getDateHired();
    }
}
