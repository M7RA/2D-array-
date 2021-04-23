
//Write a Java program, in which the user is asked to enter the number of rows r and columns c.  The user should be then asked to enter elements of two matrices. Then,the program should find the summation of each two-corresponding element in the two matrices, saves the result in another matrix. At the end, display the content of the new matrix on the screen.

import java.util.Scanner;

public class 2DSum {
    public static void main(String[] args) {
      
        Scanner kbd = new Scanner(System.in);
      
        //rows
        System.out.println("Enter number of rows:");
        int r = kbd.nextInt();

        //columns
        System.out.println("Enter number of cols:");
        int c = kbd.nextInt();


        // first matrix
        int list1[][] = new int[r][c];
        System.out.println("Please enter elements in matrix 1: ");
        for(int i=0; i< r;i++)
        {
            for(int j=0; j<c;j++)
            {
                list1[i][j]=kbd.nextInt();
            }
        }
      
      
      
        // second matrix
        int list2[][] = new int[r][c];
        System.out.println("Please enter elements in matrix 2: ");
        for(int i=0; i<r;i++)
        {
            for(int j=0; j<c;j++)
            {
                list2[i][j]=kbd.nextInt();
            }
        }

      
        //sum array
        int sum [][]= new int [r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum[i][j]=list1[i][j]+list2[i][j];
                System.out.print(sum[i][j]+" ");
            }

            System.out.println();
        }


    }
}
