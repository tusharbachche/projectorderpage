package array;

public class Singaldimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String []name=new String [10];
name [0]="hi";
name[1]="how";
name[2]="are";
name[3]="you";
name[4]="Tushar";
name[5]="TUshar";
System.out.println(name[0]);
System.out.println(name[2]);
System.out.println("=================================");
for( int i=0;i<=5;i++)
{
	System.out.println(name[i]);
}
System.out.println("=======================================");
for(int i=0;i<=name.length-1;i++)
{
	System.out.println(name[i]);
}
System.out.println("============================");
float height []=new float[50];
height[0]=12.12f;
height[1]=7;
height[2]=7.1212f;
height[40]=9.88f;
height [49]=8.999f;
System.out.println(height[40]);
for (int i=0; i<=49;i++)
{
	System.out.println(height[i]);
}
for(int i=0; i<=height.length-1;i++)
{
	System.out.println(height[i]);
}
	}

}
