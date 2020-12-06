//Push,Pop,Search element in a stack
import java.io.*;
import java.util.*;

class StackDemo
{
	public static void main(String args[])throws Exception
	{
		//create empty stack to contain Integer object.
		Stack<Integer> st=new Stack<>();
		
		int ch=0;
		int position,element;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(ch<4)
		{
			System.out.println("STACK OPERATIONS");
			System.out.println("1:Push an element:");
			System.out.println("2:Pop an element:");
			System.out.println("3:Search an element:");
			System.out.println("4:Exit");
			System.out.println("Enter your choice");
	
			ch=Integer.parseInt(br.readLine());
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter the element:");
					//int type convert to Integer object and push into the stack
					element=Integer.parseInt(br.readLine());
					st.push(element);
					break;
				case 2://top-most Integer object is popped.
					Integer obj=st.pop();
					System.out.println("Popped element is="+obj);
					break;
				case 3:
					System.out.println("Enter the element:");
					element=Integer.parseInt(br.readLine());
					
					position=st.search(element);
					if(position==-1)
					{
						System.out.println("Not Found!!");
					}
					else
					{
						System.out.println("Position:"+position);
					}
					break;
				default://come out is user choice is other than 1,2,3
					return;

			
			}		
			//view contents of stack
			System.out.println("Stack content:"+st);
		} 
	
	}

}



