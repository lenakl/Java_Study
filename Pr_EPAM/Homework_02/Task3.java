import java.util.Scanner;

public class Task3 { 
  public static void main(String[] args) { 
	Scanner in = new Scanner(System.in);

	System.out.print("Enter weight in pounds:\n"); 
	double w_pounds = in.nextDouble();
	double w_kilos = w_pounds*0.4536;
        double w_kilos1 = w_pounds*0.4536;
        //System.out.println("weight in kilos: " + w_kilos);
	int w_part_kilos = (int)w_kilos;
	double w_part_grams = (w_kilos-(int)w_kilos)*1000;
        //System.out.println("Part of weight in grams: " + w_part_grams);

	System.out.println("Kilos: " + w_part_kilos);
	System.out.println("Grams: " + (int)w_part_grams);

		
	in.close();
      } 
} 