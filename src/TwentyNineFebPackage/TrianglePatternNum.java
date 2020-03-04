package TwentyNineFebPackage;
/*
Write a program in Java to display the pattern like triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
 */
import java.util.Scanner;
public class TrianglePatternNum {

        public static void main(String[] args)// main method
        {
            int i,j,n;
            System.out.print("Input number of rows : ");// print msg to detail input
            Scanner in = new Scanner(System.in);// scanner created to put input by user
            n = in.nextInt();


            for(i=1; i<=n; i++)
            {
                for(j=1;j<=i;j++)
                    System.out.print(j);
                System.out.println("");
            }
        }
    }


