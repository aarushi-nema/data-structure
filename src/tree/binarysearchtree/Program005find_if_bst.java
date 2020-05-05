package tree.binarysearchtree;


public class Program005find_if_bst {
	
	static class Node{
		int data;
		Node left, right;
		
		public Node (int d){
			data=d;
			left=right=null;
		}
	}
	
	static class Tree{
		Node root= null;
		
		public Tree(){
			root= null;
		}
		
		public void add_left(Node parent_node, Node node){
			parent_node.left= node;
		}
		
		public void add_right (Node parent_node, Node node){
			parent_node.right= node;
		}
		
		public Boolean check_bst (Node node){
			if((node.left==null) &&(node.right == null)){
				return true;
			}
			
			if(node.right != null && node.data > node.right.data){
				return  false;
			}
			
			if(node.left!=null && node.data<node.left.data){
				return false;
			}
			
			boolean left_check= true;
			
			if (node.left != null)
				left_check = check_bst (node.left);
			boolean right_check= true;
			
			if (node.right != null)
				check_bst (node.right);
			
			if(left_check && right_check)
				return true;
			
			return false;
			
		}
	}
	
	public static void main (String [] args){

		Tree tree= new Tree();
		
		tree.root= new Node(0);
		
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
		
		if(tree.check_bst(tree.root)){
			System.out.println("Tree is BST");
		}
		
		else{
			System.out.println("Tree is not BST");
		}
		
	}
	
	

}
