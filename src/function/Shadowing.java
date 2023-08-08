package function;

public abstract class Shadowing {
    static int x=100;

    public static void main(String[] args)
    {
        System.out.println(x);
        fun();
    }



    static void fun()
        {
            System.out.println(x);
        }


    }

