package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistSTUdy {

	public static void main(String[] args) {
	
		LinkedList <Object> h=new LinkedList<>();
		h.add("Pune");
		h.add(123);
		h.add(22.22f);
		h.add(null);
		h.add(null);
		h.add(true);
		h.add("Pune");
		h.add('A');
		System.out.println(h);
h.add(4, "Hello");
System.out.println(h);
h.addFirst("new");
h.addLast("old");
System.out.println(h);
System.out.println(h.element());
System.out.println(h.getFirst());
System.out.println(h.get(4));
System.out.println(h.getLast());
System.out.println("===================================");
System.out.println(h.peek());
System.out.println(h);
System.out.println(h.peekFirst());
System.out.println(h.peekLast());
System.out.println("=========================================");
System.out.println(h.poll());
System.out.println(h);
System.out.println(h.pollFirst());
System.out.println(h.pollLast());
System.out.println(h);
System.out.println("==============================================");
for (int i=0;i<=h.size()-1;i++)
{
	System.out.println(h.get(i));
}
for(Object a:h)
{
	System.out.println(a);
}
System.out.println("=========================================");
Iterator<Object> it = h.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
System.out.println("=======================================");
ListIterator<Object> li = h.listIterator();
while(li.hasNext())
{
	System.out.println(li.next());
}



	}
	

}
