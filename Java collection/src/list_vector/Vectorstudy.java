package list_vector;

import java.util.Vector;

public class Vectorstudy {

	public static void main(String[] args) {
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
		System.out.println(v.size());
	v.add(3, "Velocity");
	System.out.println(v);
	System.out.println(v.capacity());
	System.out.println(v.size());
	System.out.println(v.elementAt(8));
	System.out.println(v.firstElement());
	System.out.println(v.lastElement());
	System.out.println(v.indexOf("Hello"));
	System.out.println(v.lastIndexOf(null));
	System.out.println(v.get(1));
	System.out.println(v.set(2, "Tushar"));
	System.out.println(v);
	}
}