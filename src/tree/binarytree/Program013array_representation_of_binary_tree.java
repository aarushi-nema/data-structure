public class Array_representation {
	
	String [] tree= new String[7];
	
	public void Root (String root){
		tree[0]=root;
	}
	
	public Integer find_parent_index(String parent){
		Integer parent_index=null;
		for(int i=0; i<tree.length; i++){
			if (parent.equals(tree[i])){
				parent_index=i;
			}
		}
		return parent_index;
	}
	
	public void add_left(String parent_node, String node){
		Integer parent_index= find_parent_index(parent_node);
		tree[parent_index*2+1]= node;
	}
	
	public void add_right(String parent_node, String node){
		Integer parent_index= find_parent_index(parent_node);
		tree[parent_index*2+2]= node;
	}
	
	public void display_tree(){
		for(int i=0; i<tree.length; i++){
			System.out.print(tree[i] + " ");
		}
	}
	
	

}

public class Array_representation_runner {

	public static void main (String [] args){
		
		/*             1
		 *           /    \
		 *         2       3
		 *        / \     /  \
		 *       4   5    6   7
		 */
			
			/* if a node is at index i and root at index 0
			 * it's left child is at 2*i +1
			 * it's right child is at 2*i+2
			 * it's parent is at i/2
			 * 
			 */
		Array_representation obj= new Array_representation();
		obj.Root("1");
		obj.add_left("1", "2");
		obj.add_right("1", "3");
		obj.add_left("2", "4");
		obj.add_right("2", "5");
		obj.add_left("3", "6");
		obj.add_right("3", "7");
		
		obj.display_tree();
		
		}
}



