import java.io.*;
import java.util.*;

public class Triplet_Sum_Array
{
    static int Sum(int[] Store, int x , int n)
    {
        Arrays.sort(Store);
        for(int i=0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                for(int k= j+1; k<n; k++)
                {
                    if(Store[i] + Store[j] + Store[k] == x)
                    {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] Store = new int[n];
        for(int i=0; i<n; i++)
        {
            Store[i]= sc.nextInt();
        }
        System.out.println(Sum(Store, x, n));
        
    }
}