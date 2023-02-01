package array;

import java.util.Arrays;

public class SingledimensionalArray {

	public static void main(String[] args) {
	
int rollNum[]= {19,11,17,16,12,18,13,14,15};
System.out.println(rollNum[3]);
System.out.println("======================================");
for (int i=0;i<=6;i++)
{
	System.out.println(rollNum[i]);
}
for(int i= 0;i<=rollNum.length-1;i++)
{
	System.out.println(rollNum[i]);
}
System.out.println("===========================================");
Arrays.sort(rollNum);
for (int i=0;i<=rollNum.length-1;i++)
{
	System.out.println(rollNum[i]);
	
}
System.out.println("==================================================");
Arrays.sort(rollNum);
for ( int i=rollNum.length-1;i>=0;i--)
{
	System.out.println(rollNum[i]);
}
	}
	

}
