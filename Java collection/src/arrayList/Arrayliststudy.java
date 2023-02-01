package arrayList;

import java.util.ArrayList;

public class Arrayliststudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList ();
		al.add("Velocity");
		al.add(126);
		al.add(71.12f);
		al.add('A');
		al.add(null);
		al.add("Velocity");
		al.add(null);
		al.add(true);
		System.out.println(al);
		System.out.println("======================");
ArrayList<String>al1=new ArrayList<>();
al1.add("Tushar");
al1.add(null);
al1.add("Tushar");
al1.add("Ram");
System.out.println(al1);
//al1.clear();
//System.out.println(al1);
Object al2 = al1.clone();
System.out.println(al2);
System.out.println(al1.contains("Tushar"));
String ele = al1.get(2);
System.out.println(ele);
System.out.println(al1.indexOf("Ram"));
System.out.println(al1.isEmpty());
//System.out.println(al1.remove(0));
System.out.println(al1);
System.out.println("============================");
al1.set(0, "Tushar");
System.out.println(al1);
System.out.println("===========================");
System.out.println(al1.size());
System.out.println("===========================");
al1.set(3, "dream");
System.out.println(al1);

	}

}
