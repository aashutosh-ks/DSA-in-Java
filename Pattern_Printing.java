import java.util.*;
public class Pattern_Printing 
{
    static void Pattern(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print('*');
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
