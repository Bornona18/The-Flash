package Collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map =new HashMap<> ();
		
		map.put(1, "Ahmed");
		map.put(2, "Rashed");
		map.put(2, "Redoy");
		map.put(3, "Rashed");
		
		//Cant duplicate key but value could be duplicate
		
		System.out.println(map.get(2));
		System.out.println(map.get(3));

	}

}
