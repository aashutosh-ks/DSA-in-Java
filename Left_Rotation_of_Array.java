import java.util.*;
public class Left_Rotation_of_Array 
{
    static void Rotation(int n, int s, int[] L)
    {
        for(int i = 0; i < s; i++)
        {
            for(int j=n; j<L.length; j++)
            {
                L[j] = L[i];
            }
        }
        for(int i = 0; i < L.length; i++)
        {
            L[i] = L[i+s];
        }
        System.out.println(Arrays.toString(L));
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] L= new int[n + s];
        for(int i = 0; i < n; i++)
        {
            L[i] = sc.nextInt();
        }
        Rotation(n, s, L);
    }   
}
