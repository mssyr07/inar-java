package week_11.assignments.Question_11_02;

public class Faculty_11_02 extends Employee_11_02 {
    private String officeHours;
    private String rank;

    public Faculty_11_02(String name, String address, String phoneNumber, String eMail,int office, double salary, String officeHours, String rank) {
        super(name, address, phoneNumber, eMail , office,salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "_Faculty_" + "\n" + super.toString() + "\nOfgfice Hours : " + officeHours + "\nRank : " + rank;
    }
}
