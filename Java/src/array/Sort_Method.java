package array;

import java.util.Arrays;

public class Sort_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade []= { 'D','A','C','F','G','h','M','F','T'};
		Arrays.sort(grade);
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		System.out.println("=====================================");
		for (int i=grade.length-1; i>=0;i--)
		{
			System.out.println(grade[i]);
		}
	}

}
