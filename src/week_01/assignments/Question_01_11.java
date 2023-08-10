package week_01.assignments;

public class Question_01_11{

	public static void main(String[]args){

		System.out.println("Population projection");
		System.out.println("Current Populatin: 312032486");
		System.out.println("One birth every 7 seconds");
		System.out.println("One death every 13 seconds");
		System.out.println("One new immigrant every 45 seconds");
		System.out.println("Yearly population projection formula : ");

		System.out.println("Current population + (Births per year)");
		System.out.println("                   - (Deaths per year)");
		System.out.println("                     (New immigrants per year)");


		System.out.println("Year 1 projection: "); 
		System.out.println(312032486+((31556926/7.0)-(31556926/13)+(31556926/45)));
		
		System.out.println("Year 2 projection: ");
		System.out.println();


	}
} 
