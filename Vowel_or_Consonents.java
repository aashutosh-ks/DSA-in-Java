import java.util.*;
public class Vowel_or_Consonents 
{
    static void Check(String[] Checking, String x)
    {
        for(int i = 0; i < Checking.length; i++)
        {
            if(Checking[i].equals(x))
        {
            System.out.println("Vowel");
            break;
        }
        else
        {
            System.out.println("Consonent");
            break;
        }
        }
        
    } 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character : ");
        String x = sc.nextLine().toLowerCase();
        String[] Checking= {"a","e","i","o","u"};

        Check(Checking, x);
    }
}

