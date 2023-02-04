/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1400);
		list1.add(50);
		list1.add(55);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1200);
		list2.add(100);
		list2.add(105);
		
		ArrayList<Object> prices = new ArrayList<Object>();
		prices.add(list1);
		prices.add(list2);
		
		/*for(int i=0;i<prices.size();i++)
		{
			ArrayList<Integer> fgh = (ArrayList)prices.get(i);
			for(int j=0;j<fgh.size();j++)
			{
				System.out.println(fgh.get(j));
			}
			
		}
		*/
		ArrayList<Double>result = new ArrayList<Double>();
		
		for(int i=0;i<prices.size();i++)
		{
			ArrayList l = (ArrayList)prices.get(i);
			int opening = (int)l.get(1);
			int closing = (int)l.get(2);
			System.out.println(opening);
			System.out.println(closing);
			double diff = (double)closing-(double)opening;
			double performing = diff/(double)opening;
			System.out.println(performing);
			result.add(performing);
			
		}
		int min=0;
		for(int i=1;i<result.size();i++)
		{
			if((double)result.get(i)<(double)result.get(min))
			{
				min=i;
			}
		}
		 
		ArrayList worst = (ArrayList)prices.get(min);
		System.out.println((int)worst.get(0));
		
	}
}
