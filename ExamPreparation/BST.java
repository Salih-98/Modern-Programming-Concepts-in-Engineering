package ExamPreparation;

public class BST {

	private NodeBTS root;
	
	public void insert (int v) {
		if(this.root==null) {
			this.root = new NodeBTS(v);
		} 
		else {
		this.root.insert(new NodeBTS(v));}
	}
	
	public boolean contains (int v) {
		return root.contains(v);
	}
	
	public void print() {
	System.out.println("Binary search tree" + root.value);
		this.root.print();
	}
	
	
	public static void main(String[] args) {
		BST bst = new BST ();
		bst.insert(6);
		bst.insert(3);
		bst.insert(8);
		bst.insert(4);
		bst.insert(6);
		bst.insert(10);
		bst.insert(7);
		bst.insert(10);
		bst.insert(2);
		bst.insert(12);
		bst.print();
		for (int i=-3; i<=3;i=i+1) {
			System.out.println("This works ? " + i*0.1);
		}
		System.out.println("System contains 7" + bst.contains(7));
		System.out.println("System contains 15 " + bst.contains(15));
	}
}
