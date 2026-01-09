import java.util.*;
public class Left_Rotation_of_Array 
{
    static void Rotation(int n, int s, int[] L)
    {
        for(int i = s; i < L.length; i++)
        {
            for(int j =0; j<L.length; j++)
            {
                L[j] = L[i];
                break;
            }
        }
        for(int j = 0; j<s; j++)
        {
            for(int i = L.length; i < n; i++)
            {
                L[i]=L[j];
            }
        }
        System.out.println(L);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] L= new int[n];
        for(int i = 0; i < n; i++)
        {
            L[i] = sc.nextInt();
        }
        Rotation(n, s, L);
    }   
}
