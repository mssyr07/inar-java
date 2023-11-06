package week_09.assignments;

public class RegularPolygonTest_09_09 {
    public static void main(String[] args) {

        RegularPolygon_09_09 polygon1 = new RegularPolygon_09_09();
        RegularPolygon_09_09 polygon2 = new RegularPolygon_09_09(6, 4);
        RegularPolygon_09_09 polygon3 = new RegularPolygon_09_09(10, 4, 5.6, 7.8);


        System.out.print("First Regular Polygon perimeter is " + polygon1.getPerimeter());
        System.out.println(" Area is : " + polygon1.getArea());
        System.out.println();

        System.out.print("Second Regular Polygon perimeter is " + polygon2.getPerimeter());
        System.out.println(" Area is : " + polygon2.getArea());
        System.out.println();

        System.out.print("Third Regular Polygon perimeter is " + polygon3.getPerimeter());
        System.out.println(" Area is : " + polygon3.getArea());


    }
}
