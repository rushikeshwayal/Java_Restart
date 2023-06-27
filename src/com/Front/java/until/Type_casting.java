package com.Front.java.until;

public class Type_casting {
    public static void main(String[] args) {
        //Widening casting is done automatically when passing a smaller size type to a larger size type:
        int num =33;
        System.out.println(num);
        double x =num;
        System.out.println(x);
       // Narrowing casting must be done manually by placing the type in parentheses in front of the value:
         double a=44.244;
         int i=(int)a;
        System.out.println(a);
        System.out.println(i);


        int _x=6;
        int y=7;
        System.out.println(_x>y);

    }
}
