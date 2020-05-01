package tree.binarysearchtree;

public class Program001searching_for_element {
	
	static class Node {
		int data;
		Node left, right;
		
		public Node (int d){
			data=d;
			left= right= null;
		}
	}
	
	static class BST {
		Node root;
		
		public BST(){
			root= null;
		}
		
		public void add_left(Node parent_node, Node node){
			parent_node.left= node;
		}
		
		public void add_right (Node parent_node, Node node){
			parent_node.right= node;
		}
		
		public Node search (Node node, int search){
			if (node==null || node.data==search){
				return node;
			}
			
			if( search<node.data){
				return search (node.left, search);
			}
			
				return search(node.right, search);
	}
	}
	
	public static void main (String [] args){
		BST tree= new BST();
		
		tree.root= new Node(8);
		
		Node node6= new Node(6);
		tree.add_left(tree.root, node6);
		
		Node node10= new Node(10);
		tree.add_right(tree.root, node10);
		
		Node node4= new Node(4);
		tree.add_left(node6, node4);
		
		Node node7= new Node(7);
		tree.add_right(node6, node7);
		
		Node node9= new Node(9);
		tree.add_left(node10, node9);
		
		Node node11= new Node(11);
		tree.add_right(node10, node11);
		
		Node node3= new Node(3);
		tree.add_left(node4, node3);
		
		Node node5= new Node(5);
		tree.add_right(node4, node5);
		
		Node found= tree.search(tree.root, 10);
		
		if(found!=null){
			System.out.println("Element found");
		}
		
		else{
			System.out.println("Element not found");
		}
	}

}
