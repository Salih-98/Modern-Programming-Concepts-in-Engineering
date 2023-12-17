package chapter1;

public class ArrayTest {

	public static void main (String [] args) {
		boolean [] b;
		double [] n = new double [20]; 
		n[0]=44.2;
		double y = n [19];
		
		//For loop for setting the values of the array
		for (int i=0; i< n.length; i++) {
			n [i] = 1.0/(i+1);
		}
		
		//for loop for printing the array
		for (int i=0; i < n.length; i++) {
			
			System.out.println("The elementh of an array with the index " + i + " is x[" + i + "] = " + n[i] + "\n");
		}
		 
		//Calculating the sum of the elements of the array
		double sum = 0;
		for (int i=0; i< n.length; i++) {
			sum= sum + n [i];
		}
		System.out.println("The sum of elements of the array is " + sum + "\n");
		
		//Defining an array whose elements are the days in the week
		String [] days = new String [7];
		days [0]= "Monday";
		days [1]= "Tuesday";
		days [2]= "Wednesday";
		days [3]= "Thursday";
		days [4]= "Friday";
		days [5]= "Saturday";
		days [6]= "Sunday";
		
		System.out.println("Days in the week are :");
		//Printing that array
		for (int i=0; i<days.length; i++) {
			System.out.println(days[i]);
		}
	}
	
} 
