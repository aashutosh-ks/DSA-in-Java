import java.util.*;
public class Sum_of_Digits
{
    static int Num(int x)
    {
        int Sum = 0;
        int rem = 0;
        while (x>0) 
        {
            rem = x%10;
            Sum = Sum + rem;
            x = x/10;
        }
        return Sum;
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        System.out.println(Num(x));
    }
}
