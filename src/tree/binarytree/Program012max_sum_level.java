package tree.binarytree;

import java.util.Queue;
import java.util.LinkedList;

public class Program012max_sum_level {
	
	static class Node {
		int data;
		Node left, right;
		
		public Node (int d){
			data= d;
			left=right=null;
		}
	}
	
	static class Binary_tree{
		Node root;
		
		public Binary_tree (){
			root= null;
		}
		
		public void add_left (Node parent_node, Node node){
			parent_node.left= node;
		}
		
		public void add_right (Node parent_node, Node node){
			parent_node.right= node;
		}
		
		public void max_sum (){
			Node node= root;
			Node level_order= new Node(-1);
			Node previous_node= root;
			
			int level=0;
			Queue<Node> queue= new LinkedList<Node>();
			int sum=0, max_sum=0, max_level=0;
			queue.add(root);
			queue.add(level_order);
			
			while(!queue.isEmpty()){
				Node front_node= queue.poll();
				
				if(front_node.data==-1){
					if(sum>max_sum){
						max_sum=sum;
						max_level=level;
					}
					level++;
					sum=0;
					
					if(previous_node.data!=-1){
						queue.add(level_order);
					}
				}else {
					sum+=front_node.data;
					
					if(front_node.left!=null)
						queue.add(front_node.left);
					if (front_node.right!=null)
						queue.add(front_node.right);
				}
				
				previous_node= front_node;
			}
			
			System.out.println("Max sum at level " + max_level + " having sum= " + max_sum);
		}
	}
	
	public static void main (String [] args){
Binary_tree tree= new Binary_tree();
		
		tree.root= new Node(1);
		
		Node node2= new Node(2);
		tree.add_left(tree.root, node2);
		
		Node node3= new Node(3);
		tree.add_right(tree.root, node3);
		
		Node node4= new Node (4);
		tree.add_left(node2, node4);
		
		Node node5= new Node(5);
		tree.add_right(node2, node5);
		
		Node node6= new Node(6);
		tree.add_left(node3, node6);
		
		Node node7= new Node(7);
		tree.add_right(node3, node7);
		
		tree.max_sum();
	}

}
