//HashTable with cricket player names nad their scores
import java.io.*;
import java.util.*;

class HashTableDemo
{
	public static void main(String args[]) throws Exception
	{
		//create HashTable
		Hashtable<String,Integer> ht =new Hashtable<>();
		
		ht.put("Ajay",77);
		ht.put("Dhoni",44);
		ht.put("Kapil",70);
		ht.put("Sachin",89);
		
		//display all player names using enumerator
		System.out.println("The player names:");
		Enumeration en=ht.keys();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
			
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter player name:");
		String name=br.readLine();
		name=name.trim();//remove spaces
		
		//get score of the player
		Integer score=ht.get(name);
		if(score !=null)
		{
			//convert score from Integer obj to int value
			int sc=score.intValue();
			System.out.println(name+"scored:"+sc);
		}
		else
		{
			System.out.println("Player not found");
		}
	}
}

