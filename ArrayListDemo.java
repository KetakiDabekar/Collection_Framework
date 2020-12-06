//ArrayList with string
import java.util.*;

class ArrayListDemo
{
	public static void main(String args[])
	{
		//create ArrayList
		ArrayList<String> al=new ArrayList<>();
		//add object
		al.add("Blue");
		al.add("Red");
		al.add("Yellow");
		al.add("Purple");
		
		System.out.println("Content of ArrayList:"+al);
		
		al.remove(3);
		al.remove("Blue");

		System.out.println("After Remove Content of ArrayList:"+al);
	
		al.add("Green");
		al.add("pink");
		System.out.println("Size of ArrayList:"+al.size());
	
	}

}


