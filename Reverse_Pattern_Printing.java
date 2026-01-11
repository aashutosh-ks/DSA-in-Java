import java.util.*;
public class Reverse_Pattern_Printing 
{
    public static void Pattern(int n)
    {
        for(int i = n; i > 0; i--)
        {
            for(int j = i; j<=n; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern(n);
    }
}
