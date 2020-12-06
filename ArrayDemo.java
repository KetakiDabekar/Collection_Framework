//sorting and searching an array

import java.util.*;
import java.io.*;

class ArrayDemo
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number:");
		int n=Integer.parseInt(br.readLine());
		//create array		
		int arr[]=new int[n];
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
		Arrays.sort(arr);

		System.out.println("The Sorted array:");
		Display(arr);
		//search for an element
		System.out.println("which element to search?");
		int element=Integer.parseInt(br.readLine());
		int index=Arrays.binarySearch(arr,element);
		if(index<0)
		{
			System.out.println("Element Not Found");
		}
		else
		{
			System.out.println("Element Found at location:"+(index+1));
		}
	
	}
	//display method-uses for each loop
	static void Display(int arr[])
	{
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}

