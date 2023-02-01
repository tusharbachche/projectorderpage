package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a11=new ArrayList<>();
a11.add(12);
a11.add(13);
a11.add(16);
a11.add(45);
a11.add(23);
a11.add(24);
System.out.println(a11);
System.out.println("=====================================");
for(int i=0;i<=a11.size()-1;i++)
{
	System.out.println(a11.get(i));
}
System.out.println("===================================");
Iterator<Integer> it = a11.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
	
}
System.out.println("=====================================");
ListIterator<Integer> tu = a11.listIterator();
while(tu.hasNext())
{
	System.out.println(tu.next());
}
for (Object a:a11)
{
	System.out.println(a);
}
	}
	

	}
