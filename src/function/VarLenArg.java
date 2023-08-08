package function;

import java.util.Arrays;

public class VarLenArg {
    public static void main(String[] args) {
//fun_int(4,45,56,563,3564,65,67);
        mix(2,4,"rajesh","KUmar","sahu");
    }
    static void mix(int a,int b,String ...n){
        System.out.println(a+" "+b+" "+Arrays.toString(n));

    }
    static void fun_int(int ...n)
    {
        System.out.println(Arrays.toString(n));
    }
}
