import java.util.ArrayList;
import java.util.HashMap;
public class Collections {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer> ();
		myList.add(7);
		myList.add(77);
		myList.add(9);
		myList.add(92);
		myList.add(71);
		myList.add(2, 99); // will add that value to the integer spot #2
		myList.add(3);
		
		System.out.println(myList);
		//remove either takes int index or any object
		// need to but the index into the ( ) so it knows which number you are trying to remove myList.remove(71); would be indexoutofbounds because the array is only 5.
		int a = 2;
		myList.remove(a); //removes the value at index 2 not the value 2 !!**
		myList.remove(71);
		myList.remove(new Integer(71));
		myList.clear();
		System.out.println(myList); // will print an empty list
	
		
		
		
		
		
	}
	
}
