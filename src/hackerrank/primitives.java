package hackerrank;

import java.util.Scanner;
import java .math.MathContext;
public class primitives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {

            try {
                long x = input.nextLong();
                System.out.println(x + " can be fitted in:");


                if (x >= -128 && x <= 127) {
                    System.out.println("*byte");
                    System.out.println("*short");
                    System.out.println("*int");
                    System.out.println("*long");
                }
                else if (x >= -32768 && x <= 32767) {
                    System.out.println("*short");
                    System.out.println("*int");
                    System.out.println("*long");
                }
                else if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("*int");
                    System.out.println("*long");
                }
                else if (x >= -9223372036854775808L && x <= 9223372036854775807L) {
                    System.out.println("*long");
                }
            } catch (Exception e) {
                System.out.println(input.next()+" can't be fitted anywhere.");
            }
        }
    }
}