/*input
2
1


*/

import java.util.*;
import java.io.*;
import java.lang.*;

class ABC{
	public static void main(String [] s)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		for (int i = 0; i<=n; i++)
		{
			for(int j=0; j<=(n-i); j++)
			{
				for(int k=0; k<=(n-(i+j)); k++)
				{
					if((i*j*k)==t)
					{

						System.out.println(n);
					}
				}
			}
		}


		// System.out.println(n);

	}
}
