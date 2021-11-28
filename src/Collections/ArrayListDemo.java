package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> myList =new ArrayList<>();
		//here Integer is a raper class.
		
		myList.add(100);
		myList.add(986);
		myList.add(56);
		myList.add(196);
		myList.add(69);
		myList.add(600);
		
		
		int max= Integer.MIN_VALUE;
		
		for(int i=0; i<myList.size(); i++){
			
			if(max<myList.get(i))
				max =myList.get(i);
		}

		//System.out.println(myList.get(2));
		System.out.println(max);
		
		
		LinkedList<Integer> myLink =new LinkedList<>();
		myLink.add(900);
		myLink.add(90);
		myLink.add(99);
		myLink.add(97);
		System.out.println(myLink.get(2));
		
		
		
		
		

	}

}
