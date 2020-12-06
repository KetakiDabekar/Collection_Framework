//sorting an array with group of Integer objects
import java.util.*;
import java.io.*;

//sort into ascending order
class Ascend implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
		return i1.compareTo(i2);
	}

}

//sort into descending order
class Descend implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
		return i2.compareTo(i1);
	}

}

class Array
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number:");
		int n=Integer.parseInt(br.readLine());
		//create array		
		Integer arr[]=new Integer[n];
		//store element in arr[]
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter an element:");
			arr[i]=Integer.parseInt(br.readLine());
		}
		//display array content
		System.out.println("Contents of the array:");
		Display(arr);
		
		//sort arr[] into ascending order
		Arrays.<Integer>sort(arr,new Ascend());

		System.out.println("The Sorted array:");
		Display(arr);

		Arrays.<Integer>sort(arr,new Descend());

		System.out.println("The Sorted array:");
		Display(arr);
	

	}
	//display method-uses for each loop
	static void Display(Integer arr[])
	{
		for(Integer i:arr)
		{
			System.out.println(i);
		}
	}
}

