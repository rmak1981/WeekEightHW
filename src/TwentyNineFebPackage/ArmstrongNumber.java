package TwentyNineFebPackage;
 /*  Check Armstrong or Not */
import java.util.Scanner;

public class ArmstrongNumber {

        public static void main(String[] args) {
            int n, nu, num=0, rem;
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter any Positive Number : ");
            n = scan.nextInt();
            nu = n;

            while(nu != 0)
            {
                rem = nu%10;
                num = num + rem*rem*rem;
                nu = nu/10;
            }
            if(num == n)
            {
                System.out.print("Armstrong Number");
            }
            else
            {
                System.out.print("Not an Armstrong Number");
            }
        }
    }

