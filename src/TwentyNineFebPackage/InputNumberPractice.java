package TwentyNineFebPackage;
// Read 10 numbers from the console entered by the user and print the sum of those numbers.

import java.util.Scanner;

public class InputNumberPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int sum = 0;
        while (a <= 10) {

            System.out.println("Enter Number #" + a);
            boolean hasNextInt = scanner.hasNextInt();a++;
            //a++;
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid #");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of all# = " + sum);
        scanner.close();

    }
}
