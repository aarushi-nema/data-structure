package tree.binarytree;

// search for an element in a binary tree
public class Program007search_element_in_binary_tree {
	
	static class Node {
		int data;
		Node left_child, right_child;
		
		public Node (int d){
			data= d;
			left_child= right_child= null;
		}
	}
	
	static class Binary_tree{
		Node root;
		public Binary_tree (){
			root=null;
		}
		
		public boolean search_element (Node node, int search){
			if(node==null)
				return false;
			
			if (node.data==search)
				 return true;
			
			 boolean ans_left = search_element(node.left_child, search);
			 boolean ans_right = search_element(node.right_child, search);
			 
			 if (ans_right || ans_left)
				 return true;
			 
			 return false;
		}
	}
	
	public static void main (String [] args){
Binary_tree tree= new Binary_tree();
		
		tree.root = new Node(12); 
        tree.root.left_child = new Node(17); 
        tree.root.right_child = new Node(54); 
        tree.root.left_child.right_child = new Node(36); 
        tree.root.left_child.right_child.left_child = new Node(122); 
        tree.root.left_child.right_child.right_child = new Node(111); 
        tree.root.right_child.right_child = new Node(9); 
        tree.root.right_child.right_child.left_child = new Node(40); 
        
        boolean b= tree.search_element(tree.root, 36);
        
        if(b)
        	System.out.println("Element found");
        else 
        	System.out.println("Element not found");
        
        
	}

}
