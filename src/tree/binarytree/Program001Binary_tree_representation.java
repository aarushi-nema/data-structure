package tree.binarytree;
//representation of binary tree 
public class Program001Binary_tree_representation {
	
	class Tree{
		 Node root;
	}
	
	class Node {
		int data;
		Node left_child, right_child;
		
		public Node (int d){
			data=d;
			left_child=right_child= null;
		}
	}

}
