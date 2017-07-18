package assignment1;
/*
 * This class will print the Hello World 
 */

public class Assignment1_3{//proper naming conventions is used 


	public static void main(String[] args) {// Main methods starts
		// TODO Auto-generated method stub

		 boolean a, b;
         a = false;
         System.out.println("a   	b     a && b   	a&b");
         do {
               b = false;
               do {
                     System.out.println(a + "\t" + b + "\t" + (a && b) + "\t" + (a & b));// printing truth table
                     b = !b;
               } while (b);
               a = !a;
         } while (a);
	}

}// class closed