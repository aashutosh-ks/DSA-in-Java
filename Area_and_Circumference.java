import java.util.*;
public class Area_and_Circumference 
{
    static double Circumference(double r)
    {
        return 2*3.14*r;
    }
    static double Area(double r)
    {
        return 3.14*r*r;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        double r = sc.nextDouble();

        System.out.println("Circumference is : " + Circumference(r));
        System.out.println("Area is : " +Area(r));
    }
    
}
