package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object> al=new ArrayList<> ();
al.add("Hi");
al.add(123);
al.add('A');
al.add(null);
al.add(12.12f);
al.add(true);
for(int i=0; i<=al.size()-1;i++)
{
	System.out.println(al.get(i));
}
System.out.println("========================================");
Iterator<Object> it = al.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
	
}
System.out.println("===========================");
ListIterator<Object> li = al.listIterator();
while(li.hasNext())
{
	System.out.println(li.next());
}
System.out.println("=========================================");
for(Object a:al)
{
	System.out.println(a);
}




	}

}
