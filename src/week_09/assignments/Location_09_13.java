package week_09.assignments;

public class Location_09_13 {

    public static int maxRow;

    public static int maxColumn;

    public static double maxValue;


    public static Location_09_13 locateLargest(double[][] array){

        Location_09_13 location = new Location_09_13();

        maxValue = array[0][0];
        maxRow = 0;
        maxColumn = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > location.maxValue){
                    maxValue = array[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }

        }
        return location;

    }
}
