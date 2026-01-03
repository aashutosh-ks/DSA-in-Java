import java.util.*;

import javax.swing.plaf.synth.SynthTreeUI;
public class Area_and_Parameter 
{
    static long area(long Len, long Bre)
    {
        return Len*Bre;
    }

    static long Perimeter(long Len, long Bre)
    {
        return 2*(Len+Bre);
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length : ");
        long Len = sc.nextLong();
        System.out.println("Enter Bredth : ");
        long Bre = sc.nextLong();

        System.out.println("Area is " + area(Len, Bre));
        System.out.println("Perimeter = " + Perimeter(Len, Bre));





        /*System.out.println("Enter Length : ");
        Scanner Length = new Scanner(System.in);
        int Len = Length.nextInt();

        System.out.println("Enter Breadth : ");
        Scanner Breadth = new Scanner(System.in);
        int Br = Breadth.nextInt();

        System.out.println("Area = " + Len*Br);
        System.out.println("Parameter = " + (2*Len+2*Br) );*/
    }

}
