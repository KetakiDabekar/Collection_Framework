//To create an ArrayList of Employee objects and search for a particular Employee object based on id number.

import java.util.*;
import java.io.*;

class Employee
{
	int id;
	String name,address;
	
	Employee(int i,String n,String a)
	{
		id=i;
		name=n;
		address=a;
	}
	void display()
	{
		System.out.println("Id of Employee:"+id+"\nEmployee Name:"+name+"\nAddress of an Employee:"+address);
	}

}

class EmpList
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int id;
		String name,address;
		
		ArrayList<Employee> al=new ArrayList<>(); 
	
		System.out.println("Enter the number of employee you wants to store:");
		int no=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=no;i++)		
		{
			System.out.println("Enter the id:");
			id=Integer.parseInt(br.readLine());
			System.out.println("Enter the name:");
			name=br.readLine();
			System.out.println("Enter the address:");
			address=br.readLine();
			Employee obj=new Employee(id,name,address);
			
			al.add(obj);	
		}

		System.out.println("Enter id to search:");
		id=Integer.parseInt(br.readLine());
		
		boolean found=false;
		
		for(int i=0;i<al.size();i++)
		{
			Employee obj=al.get(i);
			
			if(id==obj.id)
			{
				obj.display();
				found=true;
			}
		
		}		
		if(!found)
		{
			System.out.println("Employee not found!!");
		}		
				
	
	}

}
