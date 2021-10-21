/*input
1 2 3
1 2 3
3 2 1
*/

import java.util.Scanner;
public class Demo2DArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
      int [] [] arr = new int [3][3];
      Scanner s1 = new Scanner(System.in);
       for (int i = 0; i<3 ;i++) {
           for(int j= 0 ; j<3;j++) {
               arr[i][j]=s1.nextInt();
               
           }
       }
       System.out.println("print array ");
       for ( int i = 0 ; i< 3;i++) {
           for(int j =0; j<3;j++) {
               System.out.print(arr[i][j]);
           }
           System.out.println("");
       }
    }
}