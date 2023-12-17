package week_13.assignments.Question_13_11;

public class Question_13_11 {
    public static void main(String[] args) throws CloneNotSupportedException{

        Octagon ocatgon1 = new Octagon("Blue",true,10);
        System.out.println("Area : " + ocatgon1.getArea());
        System.out.println("Perimeter : " + ocatgon1.getPerimeter());

        System.out.println("Clonning the Octagon ..");

        Octagon octagon2 = (Octagon) ocatgon1.clone();

        int result = ocatgon1.compareTo(octagon2);

        if (result == 1){
            System.out.println("Ocatgon 1 is greater than the clone ");
        } else if (result == -1) {
            System.out.println("Octagon 2 is smaller than the clone");

        }else System.out.println("They re all equal");
    }
}
