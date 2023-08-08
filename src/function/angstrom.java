package function;

import java.util.Scanner;

public class angstrom 
{
    
    public static void main(String[] args) {
ang();
    }
    static void ang()
    {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int temp=n;
        int k=0;
        int t;
     while (n>0)
     {
         t = n%10;
         k=k+t*t*t;
         n=n/10;
     }
        System.out.println("value of sum "+k);
        System.out.println("value of num "+temp);

     if (k != temp)
     {
         System.out.println("Here "+k+" is equal to not "+temp);
         System.out.println(" This is not Angstrom number");
     }
     else
     {
         System.out.println("Here "+k+" is equal to "+temp);
         System.out.println("This is Angstrom number");
     }
     }
}

