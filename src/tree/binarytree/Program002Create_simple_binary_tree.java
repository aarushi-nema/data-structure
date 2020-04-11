package tree.binarytree;
// create simple binary tree
public class Program002Create_simple_binary_tree {
	
static class Node{
		
		int data;
		Node left_child, right_child;
		
		public Node (int d){
			data=d;
			left_child= right_child= null;
		}
	}
	
	static class Binary_tree {
		
		Node root;
		
		public Binary_tree(){
			root=null;
		}
		
		public void add_left_node (Node parent_node, Node node){
			parent_node.left_child= node;
		}
		
		public void add_right_node (Node parent_node, Node node){
			parent_node.right_child= node;
		}
		
	}
	
	public static void main (String [] args){
		
		Binary_tree t= new Binary_tree();
		Node root= new Node (1);
		t.root=root;
		Node node11= new Node(11);
		t.add_left_node (root, node11);
		Node node12= new Node(12);
		t.add_right_node(root, node12);
		Node node111= new Node(111);
		t.add_left_node(node11, node111);
	}
	
	

}
