import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Inpt obj1 = new Inpt();
        int result = obj1.calculation(15,25);
        System.out.println(result);


    }
}
class Inpt
{
   int calculation(int a,int b)
   {
       return a+b;
   }
}

