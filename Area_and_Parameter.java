import java.util.*;
public class Area_and_Parameter 
{
    public static void main (String[] args)
    {
        System.out.println("Enter Length : ");
        Scanner Length = new Scanner(System.in);
        int Len = Length.nextInt();

        System.out.println("Enter Breadth : ");
        Scanner Breadth = new Scanner(System.in);
        int Br = Breadth.nextInt();

        System.out.println("Area = " + Len*Br);
        System.out.println("Parameter = " + (2*Len+2*Br) );
    }

}
