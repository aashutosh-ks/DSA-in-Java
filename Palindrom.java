import java.util.*;
public class Palindrom 
{
    static boolean Pal(long num, long Hello )
    {
        long rev = 0;
        long digit = 0;
        while(num > 0)
        {
            long rem = num % 10;
            rev = digit*10 + rem;
            num = num/10;
            digit = rev;
        }
        if(digit == Hello)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num = sc.nextLong();
        long Hello = num;
        System.out.println(Pal(num, Hello));

    }
    
}
