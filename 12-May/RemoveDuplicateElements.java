public class RemoveDuplicateElements {  
	class Node{  
		int data;  
		Node next;  
		public Node(int data) {  
			this.data = data;  
			this.next = null;  
		}  
	}  
	public Node h = null;  
	public Node t = null;  
	public void addNode(int data) {  
		Node newNode = new Node(data);  
		if(h == null) {  
			h = newNode;  
			t = newNode;  
		}  
		else {  
			t.next = newNode;  
			t = newNode;  
		}  
	}  
	public void remove() {  
		Node n = h, i = null, tmp = null;  
		if(h == null) {  
			return;  
		}  
		else {  
			while(n != null){  
				tmp = n;  
				i = n.next;  
				while(i != null) {  
					if(n.data == i.data) {  
						tmp.next = i.next;  				}  
					else {  
						tmp = i;  
					}  
					i = i.next;  
				}  
				n = n.next;  
			}  
		}  
	}  
	public void display() {  
		Node n = h;  
		if(h == null) {  
			System.out.println("List is empty");  
			return;  
		}  
		while(n != null) {  
			System.out.print(n.data + " ");  
			n = n.next;  
		}  
			System.out.println();  
	}  
	public static void main(String[] args) {  
		RemoveDuplicateElements rde = new RemoveDuplicateElements();  
		rde.addNode(1);  
		rde.addNode(2);  
		rde.addNode(3);  
		rde.addNode(2);   
		System.out.print("List : ");  
		rde.display();  
		rde.remove();  
		System.out.print("Updated List : ");  
		rde.display();  
	}  
} 