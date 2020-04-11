package tree.binarytree;
//Pre-order traversal (recursive)
public class Program004Preorder_traversal_recursive {
	
	static class Node{
		
		int data;
		Node left_child, right_child;
		
		public Node(int d){
			data= d;
			left_child= right_child=null;
		}
	}
	
	static class Binary_tree{
		Node root;
		
		public Binary_tree (){
			root= null;
		}
		
		public void add_left_node (Node parent_node, Node node){
			parent_node.left_child= node;
		}
		
		public void add_right_node (Node parent_node, Node node){
			parent_node.right_child=node;
		}
		
		public void preorder_traversal (Node node){
			if(node==null)
				return;
			
			System.out.print(node.data+ " ");
			preorder_traversal(node.left_child);
			preorder_traversal(node.right_child);
		}
		
	}
	
	public static void main (String [] args){
		Binary_tree t= new Binary_tree();
		
		t.root= new Node(10);
		
		Node node11= new Node(20);
		t.add_left_node(t.root, node11);
		
		Node node12= new Node(30);
		t.add_right_node(t.root, node12);
		
		Node node111= new Node(40);
		t.add_left_node(node11, node111);
		
		Node node112= new Node(50);
		t.add_right_node(node11, node112);
		
		t.preorder_traversal(t.root);
	}

}
