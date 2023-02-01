package set_hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetstudy {

	public static void main(String[] args) {
		
	HashSet<Object>	hs=new HashSet<>();
	hs.add("Pune");
	hs.add(111);
	hs.add(123);
	hs.add(null);
	hs.add(null);
	hs.add("Mayuri");
	System.out.println(hs);
	for( Object h:hs)
	{
		System.out.println(h);
	}
	System.out.println("=======================================");
Iterator<Object> it = hs.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

	}

}
