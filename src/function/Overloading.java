package function;

import java.util.Arrays;

public class Overloading
{
    public static void main(String[] args)
    {
function(3);
function("maanas");
    }
static void function(int a)
{
    System.out.println(a);
}
static void function(String man)
{
    System.out.println(man);
}

}
