import java.util.*;
public class Prime_till_n 
{
    public static void Prime(int n)
    {
        for(int i = 2; i<=n; i++)
        {
            boolean isPrime = true;
            for (int j = 2; j*j <= i; j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }

            }
            if(isPrime)
            {
                System.out.print(i + " ");
            }
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Prime(n);
    }
}
