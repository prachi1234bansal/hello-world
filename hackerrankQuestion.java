import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        int i,j,N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if(i==0||i==N-1||j==2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if(i==N-1||j==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         System.out.println();
        for(i=0;i<N;i++)//o
        {
            for(j=0;j<N;j++)
            {
                if(i==0||i==N-1||j==0||j==N-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<N;i++)//v
        {
            for(j=0;j<N;j++)
            {
                if(((j==0||j==N-1)&&i==0)||((j==0||j==N-1)&&i==1)||((j==1||j==3)&&i==2)||((j==1||j==3)&&i==3)||(i==4&&j==2))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if(i==0||i==N-1||i==2||j==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if(i==0||i==N-1||j==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }
}
