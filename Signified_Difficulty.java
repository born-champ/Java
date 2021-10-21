/*input
15.9


*/


import java.util.*;
import java.io.*;
import java.lang.*;

class Signified_Difficulty{
	public static void main(String [] s)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		int k = str.charAt(n-1);
		k= k-48;
		
		for(int i=0; i<n-2;i++)
		{
			System.out.print(str.charAt(i));

		}
		if(k>=0 && k<=2)
		{
			System.out.print('-');

		}
		
	
		if(k>=7 && k<=9)
		{
			System.out.print('+');

		}
		


	}
}