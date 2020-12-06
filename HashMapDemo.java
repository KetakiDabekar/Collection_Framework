//HashMap used as student information
import java.io.*;
import java.util.*;

class HashMapDemo
{
	public static void main(String args[])throws Exception
	{
		//create HashMap
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int ch=0,irollno;
		String sname;
		while(true)
		{
			System.out.println("1.Enter record for new student:");
			System.out.println("2.Lookeup in book");
			//System.out.println("3.Display all student names:");
			System.out.println("4.Exit");
			
			System.out.println("1.Enter your choice:");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
					System.out.println("Enter name:");
					sname=br.readLine();
					System.out.println("Enter roll no:");
					irollno=Integer.parseInt(br.readLine());
					//store name and rollno into HashMap
					hm.put(sname,irollno);
					break;
				case 2:
					System.out.println("Enter name:");
					sname=br.readLine();
					//remove unnecessary spaces.
					sname=sname.trim();
					//pass name and get rollno
					irollno=hm.get(sname);
					System.out.println("Roll no:"+irollno);
					break;
				case 3://use keySet() to display the names create HashSet obj to store names and refer it by Set reference.
				
					java.util.Set<String> set=new HashSet<String>();
					set=hm.keySet();
					System.out.println(set);
					break;

					
				default:
					return;
			
			
			}
		
		}
	
	
	}

}

