import java.util.*;
public class Area_and_Circumference 
{
    static long Circumference(long r)
    {
        return 2*22/7*r;
    }
    static long Area(long r)
    {
        return 22/7*r*r;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        long r = sc.nextLong();

        System.out.println("Circumference is : " + Circumference(r));
        System.out.println("Area is : " +Area(r));
    }
    
}
