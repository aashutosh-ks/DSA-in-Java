import java.util.*;
public class Swap_Two_numbers
{
   static int[] number(int a, int b)
   {
        int[] Number=new int[5];
        a = a+b;
        b= a-b;
        a=a-b;
        Number[0]=a;
        Number[1]=b;
        return Number ;
   } 
   
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 1st number :");
    int a = sc.nextInt();

    System.out.println("Enter 2nd number : ");
    int b = sc.nextInt();

    int[] Display= number(a,b);

    System.out.println("Swapped number is " +Display[0] + "  " + Display[1]);
   }
}
