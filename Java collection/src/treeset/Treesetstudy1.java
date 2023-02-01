package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetstudy1 {

	public static void main(String[] args) {
		
TreeSet <Integer> ts = new TreeSet<>();
ts.add(6);
ts.add(9);
ts.add(45);
ts.add(98);
ts.add(78);
ts.add(67);
ts.add(45);
System.out.println(ts);
System.out.println(ts.first());
System.out.println(ts.last());
System.out.println(ts.floor(8));
System.out.println(ts.higher(9));
System.out.println(ts.ceiling(8));
System.out.println(ts.pollFirst());
System.out.println(ts);
System.out.println(ts.pollLast());
System.out.println(ts);
System.out.println("==========================================================");
for(Integer t:ts)
{
	System.out.println(t);
}
System.out.println("============================================================");
Iterator<Integer> it = ts.iterator();
while (it.hasNext())
{
	System.out.println(it.next());
}
	}

}
