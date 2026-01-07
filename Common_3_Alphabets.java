import java.util.*;
public class Common_3_Alphabets 
{
    static int Letter(String[] Word, int n)
    {
        for(int i =0; i<n; i++)
        {
            for(int j=i+1; j<n; j++ )
            {
                for(int k = j+1; k<n; k++)
                {
                    if(Word[i].equals(Word[j]) && Word[j].equals(Word[k]))
                    {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String x = sc.nextLine();
        String[] Word= x.split("");
        System.out.println(Letter(Word, n));
    }
}
