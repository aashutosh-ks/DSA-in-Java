import java.util.*;
public class Count_Monitor_Record_low
{
    static int Changes(int[] Rank, int n)
    {
        int Count = 10000;
        int Sum = 0;
        for(int i = 0; i < n; i++)
        {
            if(Rank[i] < Count)
            {
                Sum = Sum + 1;
            }
        }
        return Sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] Rank = new int[n];
        for(int i = 0; i < n; i++)
        {
            Rank[i]= sc.nextInt();
        }
        System.out.println(Changes(Rank, n));
    }
}
