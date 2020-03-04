package TwentyNineFebPackage;
/*
Read 10 numbers from the console entered by the user and print the sum of those
numbers.
 */
import java.util.Scanner;
public class InputNumbersClass {
        public static void main(String[] args){
            int i,n=0,s=0;
            double avg;
            {
                System.out.println("Input the 10 numbers : ");
            }
            for (i=0;i<10;i++)
            {
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                s +=n;
            }
            avg=s/10;
            System.out.println("The sum of 10 no is : " +s+"\nThe Average is : " +avg);
        }
    }


