package function;

import java.util.Scanner;

public class introduction
{
    public static void main(String[] args) {

      sum2();
    }

    static void sum()
        {
        int a, b, sum;
        a = 20;
        b = 34;
        sum = a + b;
        System.out.println("Sum is "   + sum);
        }
    static void sum2()
    {
        int c,d,sum1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num1:");
        c= in.nextInt();
        System.out.println("Enter the num2:");
        d= in.nextInt();
        sum1 = c+ d;
        System.out.println("Sum2 is: "   + sum1);
    }
}


