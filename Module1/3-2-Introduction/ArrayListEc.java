import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEc 
{
	
	public static void main(String[] args) 
	{
		//E-Entity
		
		ArrayList<String> arrayList =new ArrayList<>();
		
		arrayList.add("Java");
		arrayList.add("Php");
		arrayList.add("Flutter");
		
		
		ArrayList<String> arrayList2 =new ArrayList<>();
		
		
		arrayList2.add("GD");
		arrayList2.add("UI/UX");
		arrayList2.add("DM");
		arrayList2.add("Flutter");
		
		/*arrayList.addAll(arrayList2);
		arrayList.remove(2);
		arrayList.removeAll(arrayList2);*/
		
		arrayList.retainAll(arrayList2);
		
		
		Iterator i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
