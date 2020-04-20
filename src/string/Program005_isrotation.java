package string;
// check rotation 
public class Program005_isrotation {
	
	public static boolean is_rotation(String s1, String s2){
		if(s1.length()==s2.length()){
			String s= s1+s1;
			if(isSubstring(s, s2))
				return true;
		}
		
		return false;
			
	}
	
	public static boolean isSubstring (String s1, String s2){
		
		int l1= s1.length();
		int l2= s2.length();
		int count=0;
		
		for(int i=0; i<l1; i++){
			if(s1.charAt(i)==s2.charAt(0)){
				for(int j=0; j<l2; j++){
					if(s1.charAt(i)==s2.charAt(j)){
						count++;
					    i++;
					}
				}
				if(count==l2)
					return true;
			}
		}
		
		return false;
		
	}
	
	public static void main (String [] args){
		String s1= "waterbottle";
		String s2= "bottlew";
		
		if(is_rotation(s1,s2))
			System.out.printf("String %s is a rotation of %s", s2,s1);
		else
			System.out.printf("String %s is not a rotation of %s", s2,s1);
	}

}
