public class SearchElements {  
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
	public void searchNode(int data) {  
		Node n = h;  
		int i = 1;  
		boolean flag = false;  
		if(h == null) {  
		System.out.println("List is empty");  
		}  
		else {  
			while(n != null) {  
				if(n.data == data) {  
					flag = true;  
					break;  
				}  
				i++;  
				n = n.next;  
			}  
		}  
		if(flag)  
			System.out.println("Element is present in the list at the position : " + i);  
		else  
			System.out.println("Element is not present in the list");  
	}  
	public static void main(String[] args) {  
	SearchElements se = new SearchElements();  
	se.addNode(1);  
	se.addNode(2);  
	se.addNode(3);  
	se.searchNode(2); 
	}
}  