package TwentyNineFebPackage;

public class TriangeTree {
    public static void main(String[] args) {
        TriangeTree obj = new TriangeTree();
        obj.centerTriangle();
    }

    //public class TriangleTree {
        public  void centerTriangle()
        {
            for (int a=1;a<=5;a++)// for lop for row
            {
                for (int c =5;c>=a;c--)// for loop for space
                {
                    System.out.print(" ");
                }
                for (int b=1;b<=a;b++)// for loop for column
                {
                    System.out.print("*"+" ");
                }
                System.out.println();}
        }

    }


