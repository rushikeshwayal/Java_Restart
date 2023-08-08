package function;

public class fun1 {
    public static void main(String[] args) {
        String message = greet(" Rushikesh Wayal");
        System.out.println(message);
//   String msg= greeting();
//        System.out.println(msg);
//
//
//        int o = s(4,7);
//        System.out.println(o);
//    }
//        static String greeting()
//        {
//           String greet ="how are you";
//           return greet;
//
//        }
//
//        static int s(int a, int b)
//        {
//        int sum = a +b;
//        return sum;
//      }
    }
    static String greet(String name)
    {
        String Greet= "Hello"+name;
        return Greet;
    }
}
