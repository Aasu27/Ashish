
public class BinaryTreeNode {
	public static class Node{  
        int data;  
        Node l;  
        Node r;  
          
        public Node(int data){  
          this.data = data;  
          this.l = null;  
          this.r = null;  
        }  
      }  

      public Node root;  
        
      public static boolean flag = false;  
        
      public void SearchBinaryTree(){  
        root = null;  
      }  
         
      public void searchNode(Node tmp, int v){  
        if(root == null){  
          System.out.println("Tree is empty");  
        }  
        else{   
          if(tmp.data == v){  
            flag = true;  
               return;  
          }  
          if(flag == false && tmp.l != null){  
             searchNode(tmp.l, v);  
          }   
          if(flag == false && tmp.r != null){  
             searchNode(tmp.r, v);  
          }  
        }  
      }
	public static void main(String[] args) {
		
		BinaryTreeNode btn = new BinaryTreeNode();  
		btn.root = new Node(1);  
		btn.root.l = new Node(2);  
		btn.root.r = new Node(3);  
		btn.root.l.l = new Node(4);  
		btn.root.r.l = new Node(5);  
		btn.root.r.r = new Node(6);  

           btn.searchNode(btn.root, 2);  
          
        if(flag)  
          System.out.println("Element is present in the binary tree");  
        else  
          System.out.println("Element is not present in the binary tree");   
	}

}