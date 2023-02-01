package list_vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
	Vector<String>  v= new Vector <>();
	v.add("Tushar");
	v.add("Hello");
	v.add("Velocity");
	v.add("Wife");
	v.add("Bachche");
	v.add("Rahul");
	for (int i=0;i<=v.size()-1;i++)
	{
		System.out.println(v.get(i));
	}
	System.out.println("==========================================");
	for (String a:v)
	{
		System.out.println(a);
	}
	System.out.println("===============================================");
	Iterator<String> it = v.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("========================================================");
	ListIterator<String> li = v.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	}

}
