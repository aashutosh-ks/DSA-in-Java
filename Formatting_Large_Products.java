import java.util.*;
public class Formatting_Large_Products 
{
    static void Product(int A, int B)
    {
        int p = 1;
        for(int i = A; i<B; i++)
        {
            p = p*i;
        }
        int Q = p*B;
        int Sum = 0;
        while(Q>0)
        {
            if (Q%10 == 0)
            {
                Sum = Sum+1;
                Q = Q/10;
            }
            else
            {
                break;
            }
        }
        System.out.println(Q+" "+Sum);

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        Product(A, B);

    }    
}
