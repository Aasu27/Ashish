
public class InsertMiddleNode {   
    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
    public int s;  
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
        s++;  
    }    
    public void addInMid(int data){ 
        Node newNode = new Node(data);   
        if(h == null) {  
            h = newNode;  
            t = newNode;  
        }  
        else {  
            Node tmp, n;   
            int c = (s % 2 == 0) ? (s/2) : ((s+1)/2);  
            tmp = h;  
            n = null;  
            for(int i = 0; i < c; i++) {  
                n = tmp;    
                tmp = tmp.next;  
            }   
            n.next = newNode;   
            newNode.next = tmp;  
        }  
        s++;  
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
  
        InsertMiddleNode imn = new InsertMiddleNode(); 
        imn.addNode(1);  
        imn.addNode(2);  
        System.out.print("List : ");  
        imn.display();    
        imn.addInMid(3);  
        System.out.print( "Updated List : ");  
        imn.display();  
    }  
}  