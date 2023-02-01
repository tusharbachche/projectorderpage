package set_linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LInkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet <Object> lh=new LinkedHashSet<>();
lh.add("Tushar");
lh.add(123);
lh.add("Pune");
lh.add(465);
lh.add("Tushar");
lh.add("Pune");
lh.add(null);
lh.add(null);
System.out.println(lh);
for (Object l:lh)
{
	System.out.println(l);
}
System.out.println("===========================================");
Iterator<Object> it = lh.iterator();
while( it.hasNext())
{
	System.out.println(it.next());
}
	}

}
