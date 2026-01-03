import java.util.*;
public class Celcius_to_Farhenheit
{
     static double Temp (double Degree)
     {
        return 32+(Degree*9/5);
     }

     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celcius : ");
        double Degree = sc.nextDouble();
        System.out.println("Temperature in Farhenheit is : " + Temp (Degree));
     }
}
