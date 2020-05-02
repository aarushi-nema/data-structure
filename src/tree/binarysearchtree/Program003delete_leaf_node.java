package tree.binarysearchtree;

public class Program003delete_leaf_node {
	
	static class Node {
		int data;
		Node left, right;
		
		public Node (int d){
			data=d;
			left= right=null;
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
		
		public void add_right(Node parent_node, Node node){
			parent_node.right= node;
		}
		
		public void inorder_traversal (Node node){
			if(node==null){
				return;
			}
			
			inorder_traversal(node.left);
			System.out.print(node.data + " ");
			inorder_traversal(node.right);
		}
		
		public void delete_leaf_node (Node node, int element){
			if(node==null){
				return;
			}
			
			if(node.left!= null && (node.left).data==element){
				node.left=null;
				return;
			}
			
			if(node.right!=null &&(node.right).data==element){
				node.right=null;
				return;
			}
			
			if(element<node.data){
				delete_leaf_node(node.left, element);
			}
			 
			if(element>node.data){
				delete_leaf_node(node.right, element);
			}
			 
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
		
		int delete_element= 7;
		
		System.out.println("Original Tree");
		tree.inorder_traversal(tree.root);
		tree.delete_leaf_node(tree.root, delete_element);
		System.out.println();
		System.out.println("Tree after deleting element " + delete_element);
		tree.inorder_traversal(tree.root);
	}
	


}
