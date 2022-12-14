import java.util.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	int maxVal = 0;
        
        if (root.right != null){
            int val = 1 + heightHelper(root.right);
            
            if (val > maxVal){
                maxVal = val;
            }
        }
        
        if (root.left != null){
            int val = 1 + heightHelper(root.left);
            
            if (val > maxVal){
                maxVal = val;
            }
        }
        
        return maxVal;
    }
    
    private static int heightHelper(Node node){
        int maxVal = 0;
        
        if (node.right != null){
            int val = 1 + heightHelper(node.right);
            
            if (val > maxVal){
                maxVal = val;
            }
        }
        
        if (node.left != null){
            int val = 1 + heightHelper(node.left);
            
            if (val > maxVal){
                maxVal = val;
            }
        }
        
        return maxVal;
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}
