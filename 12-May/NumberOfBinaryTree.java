public class NumberOfBinaryTree {
	public static class Node {
		int data;
		Node l , r;
		
		Node(int data){
			this.data = data;
			l = r = null;
		}
	}
	public Node root;
	public NumberOfBinaryTree() {
		root = null;
	}
	public int factorial(int n) {
		int fact = 1;  
        if(n == 0)  
            return 1; 
        else { 
        	while(n > 1) { 
        		fact = fact * n;  
                n--; 
        	}
        	return fact;
        }
	}
	public int numOfTree(int k) {  
		int c = factorial(2 * k)/(factorial(k + 1) * factorial(k));  
        return c;
	}
	public static void main(String[] args) {	
		NumberOfBinaryTree nbt = new NumberOfBinaryTree();
		System.out.println("Total Binary Tree : " + nbt.numOfTree(3));
	}

}