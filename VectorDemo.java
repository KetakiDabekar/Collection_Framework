//Creating vector with Integer elements
import java.util.*;

class VectorDemo
{
	public static void main(String args[])
	{
		//take vector to store integer element.
		Vector<Integer> v=new Vector<>();
		//take an integer type array.
		int f[]={101,123,456,788,9876};
		
		//when f[i]is stored into vector .f[i] values are converted into Integer objects and stored into vector(auto boxing)
		for(int i=0;i<f.length;i++)
		{
			v.add(f[i]);		
		}
	
		//retrieve using get()	
		System.out.println("Vector elements:");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
	}

}
