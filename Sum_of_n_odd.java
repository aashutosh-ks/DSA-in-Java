import java.util.*;
public class Sum_of_n_odd 
{
    static int Addition(int n)
    {
        int Sum = 0;
        for(int i = 1; i <= 2*n; i+=2)
        {
            Sum += i; 
        }
        return Sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(Addition(n));


    }
    
}
