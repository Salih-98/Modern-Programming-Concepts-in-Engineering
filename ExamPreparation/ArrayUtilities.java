package ExamPreparation;

public class ArrayUtilities {

	public static int indexOf (double v, double [] x ) {
		for (int i=0; i<x.length;i++) {
			if (v == x[i]) {return i;}
		}
		double [] [] x1 = new double [2][3];

		return -1;
	}
	
	public static boolean containsValue (double v, double []x) {
			for (int i=0; i<x.length;i++) {
				if (v == x[i]) {return true;}
			}
			return false;
		}
	
	public static boolean isAbsDescending(double [] x) {
		for (int i=0; i<x.length-1; i++) {
			if (  Math.abs(x[i]) < Math.abs(x[i+1])) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean containsDuplicates (double [] x) {
		
		for (int i=0; i<x.length-1; i++) {
			for (int j=i+1; j<x.length;j++) {
				if (x[i]==x[j]) {return true;}
			}
		}
		return false;
	}
	
	public static boolean containsArray( double [] x, double [] y) {
		
		for (int j=0; j<y.length; j++) { //go over all y elements
			
			if (y[j] == x[0]) { //if one y element is equal to the first of x, possible that y contains x
			boolean b = true; //set local variable to carry the boolean value 
			
			for (int i=0; i< x.length;i++) { //check all the following elements of the x sequence
					if (x[i] != y [j+i]) {
						b=false;//if at any point element of sequence and x and the following element of y don't match
								//y doesn't contain x in this point, local variable is false
						break;}	 // break the inner loops, no need to check other elements
			} 
			
			if (b==true) { // Is it true that sequence is contained?
				return true;} // if yes return true
					}
			//if not, continue for next y elements
			}
		
		//after all y elements have been checked, and it has been found, y doesn't contain x and return false
		return false;
	
	}
	
	public static boolean isDescending(int[] x) {
		
		for (int i=0; i<x.length-1;i++) {
			if(x[i]<x[i+1]) {return false;}
			
								}
		return true;
		}
	
	public static boolean compare (int [] x, int [] y ) {
		if (x.length==y.length) {
			for (int i =0; i<x.length; i++) {
				if (x[i] != y[i]) {return false;}
			}
			return true;
		}
		return false;
	}

	public static void printMinMax(double [] x) {
		double min = x[0];
		double max = x[0];
		
		for (int i =0; i<x.length;i++) {
			if (x[i]<min) {min = x [i];}
			if(x[i]>max) {max = x[i];}
			
		}
		
		System.out.println("Max value of the array is: " + max);
		System.out.println("Min value of the array is: " + min);
		
	}
	
	public static void reverse(double[] a) {
		double [] a1 = new double[a.length];
		for (int i =0; i<a.length; i++) {
			a1[a.length-1-i] = a[i];
			a[i]=a1[i];
		}
		
		for(int i =0; i<a.length;i++) {
			a[i] = a1[i];
		}
	}
	
	public static double [] [] cholesky (double [] [] a ){
		
		int n = a.length;
		double[] [] L = new double [n][n];
		
		for (int i=0; i<n;i++) {
			
			
			
				double s=0; 
					for (int k=0; k<i; k++) {
						s = s + Math.pow(L[i][k], 2);
					}
				
				L[i][i] = Math.sqrt(a[i][i] - s);
				
				for (int j = i+1; j<n; j++) {
		
				double s1=0;
				
					for (int k=0; k<i;k++) {
						s1 = s1 + L[j][k]*L[i][k];
					}
					
					L[j][i] = (a[j][i]-s1)/L[i][i];	
					
	
			}
		}
		
		return L;
	}
	
	public static void sort (int [] numbers, int left, int right) {
		int leftHold = left;
		int rightHold = right;
		int pivot = numbers[left];
		
		while (left<right) {
			while(numbers[right]>=pivot && left<right) {
				right=right-1;
			}
			
			if(left!=right) {
				numbers[left]=numbers[right];
				left = left +1;
			}
			
			while (numbers[left]<=pivot && left<right) {
				left=left+1;
			}
			
			if(left!=right) {
				numbers[right] = numbers [left];
				right=right-1;
			}
		}
		
		numbers[left]=pivot;
		pivot=left;
		left=leftHold;
		right=rightHold;
		
		if(left<pivot) {
			ArrayUtilities.sort(numbers, left, pivot-1);
		}
		
		if(right>pivot) {
			ArrayUtilities.sort(numbers, pivot+1, right);
		}
		
	}
	
	public static double decisiveMoment(int s1, int s2, double q, double l) {
	if(s1==1 && s2==1) { return q*l*l/8;}
	if(s1==2 && s2==2) { return -1*q*l*l/12;}
	if((s1==2 && s2==1) || (s1==1 && s2==2)) { return -1*q*l*l/8;}
	return Double.NaN;
	
	}
	
	public static boolean isSorted(int [] numbers) {
		for(int i=0; i<numbers.length-1;i++) {
			if(numbers[i]>numbers[i+1]) {return false;}
		} return true;
	}
	
	public static double mean(double [] x) {
		int n=x.length;
		double s=0;
		
		for (int i=0; i<n; i++) {s=s+x[i];}
		System.out.println("Mean is " + s/n);
		return s/n;
	}
	
	public static double var(double [] x) {
		int n=x.length;
		double s=0;
		double mu= ArrayUtilities.mean(x);
		
		for (int i=0; i<n; i++) {
			s= s+ Math.pow(x[i]-mu,2);
		}
		
		return s/(n-1);
	}
	
	
	
	public static void main (String [] args) {
		double [] x = new double [3];
		double [] y = new double [6];
		
		x[0]=6;
		x[1]=8;
		x[2]=4;
		
		//System.out.println("Index of the value 4 in the array x : " + ArrayUtilities.indexOf(4.0,x));
		//System.out.println("index of the value 7 in the array x: " + ArrayUtilities.indexOf(7.0, x)+ "\n");
		
		//System.out.println("Value 6 is in the array x :" + ArrayUtilities.containsValue(6,x));
		//System.out.println("Value 5 is in the array x : " + ArrayUtilities.containsValue(5,x) + "\n");
		
		//System.out.println("Array x is descending :" + ArrayUtilities.isAbsDescending(x) + "\n");
		double [] x11 = {1,1,1,1,1,1,1};
		double [] x1 = new double [5];
		x1[0]=8;
		x1[1]=7;
		x1[2]=6;
		x1[3]=5;
		x1[4]=4;
		
		double [] x3 = new double [4];
		
		x3[0]=8;
		x3[1]=7;
		x3[2]=6;
		x3[3]=5;
		
		int [] x4 = new int [4];
		
		x4[0]=8;
		x4[1]=5;
		x4[2]=6;
		x4[3]=7;
		
		int [] x5 = new int [5];
		
		x5[0]=8;
		x5[1]=5;
		x5[2]=6;
		x5[3]=7;
		x5[4]=9;
		
		ArrayUtilities.reverse(x1);
		
		//System.out.println("The reverse array x3 is: ");
		
		//for(int i=0;i<x1.length;i++) {
		//	System.out.println(" " + x1[i]);
		//}
		
		//ArrayUtilities.printMinMax(x3);
		//System.out.println("The arrays x4 and x5 are duplicates " + ArrayUtilities.compare(x4,x5));
		
		//System.out.println("The array x3 is descending (real values): " + ArrayUtilities.isDescending(x4));
		
		//System.out.println("The array x3 has duplicates : " + ArrayUtilities.containsDuplicates(x3));
		//System.out.println("The array x1 has duplicates : " + ArrayUtilities.containsDuplicates(x1) + "\n");
		
		//System.out.println("Array x1 is descending :" + ArrayUtilities.isAbsDescending(x1) + "\n");
		
		double [] x2 = new double [6];
		x2[0]=8;
		x2[1]=7;
		x2[2]=-6;
		x2[3]=5;
		x2[4]=-4;
		x2[5]=4;
		
		//System.out.println("Array x2 is descending :" + ArrayUtilities.isAbsDescending(x2));
		//System.out.println("Array x2 has duplicates " + ArrayUtilities.containsDuplicates(x2) + "\n");
		
		y[0]=5;
		y[1]=6;
		y[2]=3;
		y[3]=8;
		y[4]=3;
		y[5]=4;
		
		//System.out.println("Array y contains array x :" + ArrayUtilities.containsArray(x, y)+ "\n" );
		
		int [] y2 = new int [6];
		
		y2[0]=5;
		y2[1]=-6;
		y2[2]=12;
		y2[3]=6;
		y2[4]=9;
		y2[5]=4;
		
		double [] [] a = new double [2][3];
		int a1 = a.length;
		//System.out.println(" " + a1);
		//System.out.println("Array y2 contains array x :" + ArrayUtilities.containsArray(x, y2) + "\n");
		
		//double [] [] A = {{6,15,55},{15, 55, 225}, {55,225,979}};
		//System.out.println(" " + A.length);
		//double [] [] L = ArrayUtilities.cholesky(A);
		
		//System.out.println("Elements of L computed with the cholesky method ");
		
		//for (int i=0; i<L.length;i++) {
		//	for (int j=0; j<L.length; j++) {
		//	if (j==0) { System.out.print("|	" + L[i][j]+",		");
		//	} else if (j==L.length - 1) {
		//		System.out.print(L[i][j]+"    |" + "\n");
		//	} else {
		//		System.out.print(L[i][j]+",    ");
		//	}
	//	}}
		
		//ArrayUtilities.sort(y2, 0, 5);
		//System.out.println("Array y2 after applying the sort algorithm look like : ");
		//for (int i=0; i<y2.length;i++) {
		//	System.out.println("y2[" + i +"] =" +y2[i]);
		//}
		//System.out.println("Array y2 is sorted " +ArrayUtilities.isSorted(y2));
		
		//System.out.println("Decisive moment is " + ArrayUtilities.decisiveMoment(3,2,5,2.7));
		
		double []  x10 = new double [1000];
		double []  y10 = new double [1000];
		double []  z10 = new double [1000];
		
		for (int i=1; i<=1000; i++) {
			x10[i-1] =i;
			y10[i-1] = (i+1)*555;
			z10[i-1] = (i+1)+555;
		}
		
		
		System.out.println("The right side of equation 3 is " + ArrayUtilities.var(x10));
		System.out.println("Left side of equation 3 is " + ArrayUtilities.var(z10));
		System.out.println("Left side of equation 4 is " + ArrayUtilities.var(y10));
		System.out.println("Right side of equation 4 is " + ArrayUtilities.var(x10)*555*555);
		
				}
	
	
	
}


