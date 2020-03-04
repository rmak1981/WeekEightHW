package TwentyNineFebPackage;
/*
Write a method named sumFirstAndLastDigit with one parameter of type int called number
 */

import java.util.Scanner;

public class SumFirstAndLastDigit {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();
        boolean hasNextInt = scanner.hasNextInt();

        System.out.println(sumFirstLast(212));
    }
    public static int sumFirstLast(int number){
        // number = 12 should output 3
        int num = number;
        if(num < 0){
            return -1;
        }
        int lastDigit = num % 10;

        while(num >= 10){
            num = number / 10;
        }
        int firstDigit = num ;
        return firstDigit + lastDigit;
    }
}

