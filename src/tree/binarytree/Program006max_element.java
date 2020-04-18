package tree.binarytree;
// find max element in a binary tree
public class Program006max_element {
	
	static class Node{
		int data;
		Node left_child, right_child;
		
		public Node(int d){
			data=d;
			left_child=right_child=null;
		}
	}
	
	static class Binary_tree {
		
		Node root;
		
		public Binary_tree(){
			root=null;
		}
		
		public void add_left_child (Node parent_node, Node child_node){
			parent_node.left_child= child_node;
		}
		
		public void add_right_child (Node parent_node, Node child_node){
			parent_node.right_child= child_node;
		}
		
		public int find_max_element (Node node){
			if(node==null)
				return Integer.MIN_VALUE;
			
			int n= node.data;
			int nl= find_max_element(node.left_child);
			int nr= find_max_element(node.right_child);
			
			if (nl>n)
				n=nl;
			else if (nr>n)
				n=nr;
			return n;
			
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
        
        System.out.println("Maximum element is " + 
                tree.find_max_element(tree.root));
        
        
		
		
	}
	


}
