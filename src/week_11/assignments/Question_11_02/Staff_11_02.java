package week_11.assignments.Question_11_02;

public class Staff_11_02 extends Employee_11_02 {

    private String title;

    public Staff_11_02(String name, String address, String phoneNumber, String eMail, String title, int office, String salary){
        super(name,address,phoneNumber,eMail,office, Double.parseDouble(salary));
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTitle : " + title;
    }
}
