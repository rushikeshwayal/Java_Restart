package hackerrank;

import java.util.Scanner;
import java.math.MathContext;

public class s_hacker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        double res = 0;
        for (int i = 0; i <q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j=0;j<n;j++)
            {
                res = a += Math.pow(2, j) * b;
                System.out.println(res);
            }

        }
    }
}