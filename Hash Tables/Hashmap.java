import java.util.*;
class Java
{
	public static void main(String args[])
	{
		String str = "geeksforgeeks";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] array = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(map.size()>0)
			{
				if(map.containsKey(array[i]))
				{
					int x= map.get(array[i]);
					map.put(array[i],x+1);
					
				}
				else
				map.put(array[i],1);
			}
			else
			map.put(array[i],1);
		}
		for(Map.Entry m : map.entrySet())
		{
			if((int)m.getValue()==1)
			{
			System.out.println(m);
			break;
			}
		}
	}
}