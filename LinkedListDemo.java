//A Linket List with String
import java.io.*;
import java.util.*;

class LinkedListDemo
{
	public static void main(String args[]) throws Exception
	{
		//create empty linked list to store strings.
		LinkedList<String>ll=new LinkedList<>();
	
		ll.add("America");
		ll.add("India");
		ll.add("Paris");
		
		//display element in linked list
		System.out.println("List:"+ll);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String element;
		int position,ch=0;
		
		while(ch<4)
		{
			System.out.println("\nLinked List operations");
			System.out.println("1.Add an element:");
			System.out.println("2.Remove an element:");
			System.out.println("3.Change an element:");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			ch=Integer.parseInt(br.readLine());
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter your string:");
					element=br.readLine();
					System.out.println("At which position:");
					position=Integer.parseInt(br.readLine());
					ll.add(position-1,element);
					break;
				case 2:
					System.out.println("At which position:");
					position=Integer.parseInt(br.readLine());
					ll.remove(position-1);
					break;

				case 3:
					System.out.println("At which position:");
					position=Integer.parseInt(br.readLine());
					System.out.println("Enter your string:");
					element=br.readLine();
					ll.set(position-1,element);
					break;
				default://if user enter other than this 1,2,3
					return;			
			}			
					System.out.println("List:"+ll);
		}
	}	
}


