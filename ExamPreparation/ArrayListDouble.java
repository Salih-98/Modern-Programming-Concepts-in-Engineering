package ExamPreparation;

public class ArrayListDouble {

	private double [] elements;
	
	public ArrayListDouble() {
		this.elements=new double [0];
	}
	public ArrayListDouble(int size) {
		this.elements=new double [size];
	}
	
	public void insert (int i, double x) {
		this.checkIndex(i);
		double [] temp = new double [this.size()+1]; //Local array has to be for one bigger than the 
													//original, because we add one element
		
		for (int j=0; j<i; j++) {
			temp[j] = this.elements[j]; 
			// copy element up to the desired position
		} 
		temp[i]=x; // add the new one
		for (int j=i; j<this.size();j++) {
			temp[j+1]=this.elements[j];
		}
		this.elements=temp;
	}
		
	public void add(double x) {
		this.insert(this.size(), x);
	}
	public int size () {return this.elements.length;}
		
	public double get (int i) {
		this.checkIndex(i);
		return this.elements[i];
	}
	
	public void set (int i, double x) {
		this.checkIndex(i);
		this.elements[i]=x;
	}
	
	public void checkIndex(int i) {
		if (i>this.size() || i<0) { throw new IndexOutOfBoundsException("Index :" + i);}
	}
	
	public void remove (int i ) {
		this.checkIndex(i);
		
		double [] temp = new double [this.size()-1];
		
		for (int j=0; j<i;j++) {
			temp[j]=this.get(j);
		}
		for(int j=i+1; j<this.size();j++) {
			temp[j-1]=this.get(j);
		}
		this.elements=temp;
	}
	
	public void print() {
		System.out.print("<");
		for (int j=0; j<this.elements.length-1; j++) {
			System.out.print(this.elements[j]+",");
		}
		System.out.println(this.elements[this.elements.length-1]+">");
	}
	
	}

