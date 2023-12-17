package ExamPreparation;

public class NodeBTS {

	public int value;
	private NodeBTS left;
	private NodeBTS right;
	
	public NodeBTS(int v) { 
		this.value=v;
		this.left=null;
		this.right=null;}
	
	public void insert (NodeBTS n) {
		if (n.value <= value) {
			if (left==null) {
				left = n;
			} else { 
				left.insert(n);
				}
			} else {
				if (right==null) { 
					right=n;} 
						else {
						right.insert(n);
					}
			}
		}
	
	public boolean contains (int v) {
		if (v<value) {
			if (left!= null) {
				return left.contains(v);
			} else {return false;}
		} else {
			if (v>value) {
				if (right!=null) {
					return right.contains(v);
				} else {return false;}
			} else {return true;}
		}
	}
	
	public void print() {
		System.out.println("Called for " + this.value);

		if(this.left == null && this.right==null) {
			System.out.println("" + this.value);
		} 	else { 
			if(this.left!=null) {
				System.out.println("a ");
				this.left.print();
				if (this.right==null) {
					System.out.println( this.value);}
				else{
					System.out.println(this.value);
					System.out.println("b");
					this.right.print();
				}
				}  else {
					System.out.println(this.value);
					System.out.println("c");
					this.right.print();
				}
				}
		
		}
		
	
	
	public static void main (String [] args) {
		NodeBTS n = new NodeBTS(5);
		NodeBTS n1 = new NodeBTS (3);
		NodeBTS n2 = new NodeBTS (7);
	
		n.insert(n1);
		n.insert(n2);
		n1.insert(new NodeBTS (4));
		n1.insert(new NodeBTS(2));
		
		
	}
	}
	

