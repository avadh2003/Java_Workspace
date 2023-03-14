package task3_3;


import java.util.HashMap;
import java.util.Map;

public class HashMap1
{
	
	public static void main(String[] args) 
	{		
		HashMap<String,Integer> hashmap = new HashMap<>();
		
		hashmap.put("A", 100);
		hashmap.put("B", 200);
		hashmap.put("C", 300);
		hashmap.put("D", 400);
	
		System.out.println(hashmap);
		
		System.out.println(hashmap.get("A"));
		
		for(Map.Entry m: hashmap.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}
	
	
}