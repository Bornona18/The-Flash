package Collections;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main (String[] args){
		
		
		
		String [] names= {"bor", "kor", "sor", "tor"};
		
		HashSet<String> mySet =new HashSet<>();
		
		for(int i=0; i<names.length; i++) {
			mySet.add(names[i]);
			
		}
		
		System.out.println(mySet);
		
		
		
//		mySet.add("Mahbub");
//		mySet.add("Rashed");
//		mySet.add("Ehsan");
//		mySet.add("Bornona");
//		mySet.add("Mahbub");
		
		System.out.println(mySet);
		
		
	}
	
	

}
