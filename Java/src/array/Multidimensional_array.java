package array;

public class Multidimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String animal[][]=new String [2][3];
animal[0][0]="Dog";
animal[0][1]="Cat";
animal[0][2]="Tiger";
animal[1][0]="MOnkey";
animal[1][1]="Snake";
animal[1][2]="Crow";
System.out.print(animal[0][0]+" ");
System.out.print(animal[0][1]+" ");
System.out.println(animal[0][2]+" ");
System.out.print(animal[1][0]+" ");
System.out.print(animal[1][1]+" ");
System.out.println(animal[1][2]+" ");
System.out.println("=======================================");
String player[][]=new String[2][2];
player[0][0]="Shehawagh";
player[0][1]="Sachin";
player [1][0]="Dhoni";
player[1][1]="Yuvaraj";
System.out.print(player[0][0]+" ");
System.out.println(player[0][1]);
System.out.print(player[1][0]+" ");
System.out.println(player[1][1]);

	}

}
