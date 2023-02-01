package list_vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_curser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> v =new Vector<>();
		v.add("Pune");
		v.add(123);
		v.add(123.23f);
		v.add(null);
		v.add(null);
		v.add("Mumbai");
		v.add("Hi");
		v.add("Hello");
		v.add(4535);
		v.add(24);
		v.add("Tushar");
		System.out.println(v.capacity());
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("=========================================");
		for(Object a:v)
		{
			System.out.println(a);
		}
		System.out.println("==========================================");
		Iterator<Object> it = v.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		ListIterator<Object> li = v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
