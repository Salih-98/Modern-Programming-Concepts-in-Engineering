package ExamPreparation;

public class ArrayListDoubleDemo {
	
public static void main(String[] args) {

		ArrayListDouble list = new ArrayListDouble();

		list.add(5.0);
		list.print();
		list.add(4.0);
		list.print();
		list.set(0, 1.0);
		list.print();

		list.insert(1, 3.0);
		list.add(5.0);
		list.print();

		list.remove(2);
		list.print(); 
	}
}
