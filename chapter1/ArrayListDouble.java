package chapter1;

public class ArrayListDouble {

		private double elements [];
		
		public ArrayListDouble () {	 this.elements = new double [0];  }
		
		public ArrayListDouble(int size) { this.elements = new double [size]; }
		
		public void insert (int i, double x) {
			
			if (i<0 || i> this.elements.length) {
				throw new IndexOutOfBoundsException("i < 0 || i > size() with i="+i);
			}
			
			double [] tmp = new double [this.elements.length+1];
			
			for (int j=0; j<i; j++) {
				tmp [j] = this.elements[j];
			}
			
			tmp [i] = x;
			
			for (int j=i; j<this.elements.length; j++) {
				tmp [j+1] = this.elements[j];
			}
			
			this.elements=tmp;}
			
			public void add (double x) {
				this.insert(elements.length, x); }
			
			public void set(int i, double x) {
					if (i<0 || i>this.elements.length-1) {
						return;
					}
					this.elements[i] = x;}
		
			public double get (int x) {
				return this.elements[x];
			}
	
			public void remove(int i) {
				if (i<0 || i>this.elements.length-1) { //provjeravamo da li je uneseni indeks tacan
					
					return;
				}
				double[] tmp = new double[this.elements.length-1];//novi niz koji ce imati jedan element manje
				
				for (int j=0; j<i; j++) {
					tmp[j] = this.elements[j]; //novom nizu dodijeljujemo vrijednosti starog niza sve do trazene pozicije
				}
				
				for (int j=i+1; j<this.elements.length; j++) { //Nastavljamo dodijeljivati elemente novom nizu s preskakanjem 
																//niza na unesenoj poziciji
					tmp[j-1] = this.elements[j];
				}
				this.elements = tmp; //dodjeljujemo novi, trazeni niz pocetnom nizu
			}
			
			public void print() {
				System.out.print("<");
				for (int j=0; j<this.elements.length-1; j++) {
					System.out.print(this.elements[j]+",");
				}
				System.out.println(this.elements[this.elements.length-1]+">");
			}
			
			//Demo program
			
			public static void main(String[] args) {

				ArrayListDouble list = new ArrayListDouble();

				list.add(5.0);
				list.add(4.0);
				list.set(0, 1.0);
				list.print();

				list.insert(1, 3.0);
				list.add(5.0);
				list.print();

				list.remove(2);
				list.print(); 
			}
}
