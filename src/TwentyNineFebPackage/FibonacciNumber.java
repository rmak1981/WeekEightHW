package TwentyNineFebPackage;

public class FibonacciNumber {
    /*
set the number of elements to get Fibonancci Number
     */
    public static void main(String[] args) {
        FibonacciNumber obj = new FibonacciNumber();// object created to call method
        obj.fiboNumber(); // method called to main method
    }
    public void fiboNumber() {
        int a = 1;
        int b = 1;
        System.out.println("Fibonacci Number");
        for (int i = 0; i < 10; i++) {// i < 10 less then ten numbers to be shown in fibonacci series
            System.out.println(a);// print out a which will be fibonacci number
            int r = a + b;
            a = b;
            b = r;
        }
    }
}





