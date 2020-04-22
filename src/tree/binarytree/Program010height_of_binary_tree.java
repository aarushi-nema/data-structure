package tree.binarytree;

public class Program010height_of_binary_tree {
	
	static class Node{
		int data;
		Node left_child, right_child;
		
		public Node(int d){
			data= d;
			left_child= right_child= null;
		}
	}
	
	static class Binary_tree{
		Node root;
		
		public Binary_tree(){
			root= null;
		}
		
		public void add_left_child (Node parent_node, Node left_node){
			parent_node.left_child= left_node;
		}
		
		public void add_right_child (Node parent_node, Node right_node){
			parent_node.right_child= right_node;
		}
	}
	
	public static int find_height(Node node){
		
		if(node==null)
			return 0;
		
		int left_height= find_height(node.left_child);
		int right_height= find_height(node.right_child);
		
		if(left_height>right_height)
			return (left_height +1);
		else
			return (right_height +1);
		
	}
	
	public static void main (String [] args){
		Binary_tree tree= new Binary_tree();
		
		tree.root= new Node(1);
		
		Node node2= new Node(2);
		tree.add_left_child(tree.root, node2);
		
		Node node3= new Node(3);
		tree.add_right_child(tree.root, node3);
		
		Node node4= new Node(4);
		tree.add_left_child(node2, node4);
		
		Node node5= new Node(5);
		tree.add_right_child(node2, node5);
		
		Node node6= new Node(6);
		tree.add_left_child(node3, node6);
		
		Node node7= new Node(7);
		tree.add_right_child(node3, node7);
		
		System.out.println("Height of binary tree: "+ find_height(tree.root));
	}
}
	
	
