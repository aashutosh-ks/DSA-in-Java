import java.util.*;
public class HCF 
{
    static int cal(int a, int b)
    {
        int HigherstCF = 0;
        ArrayList<Integer> Factor_a= new ArrayList<>();
        //Factor_a.add(a);
        for(int i = 1; i <= a; i++)
        {
            if(a%i == 0)
            {
                Factor_a.add(i);
            }
        }
        ArrayList<Integer> Factor_b = new ArrayList<>();
        //Factor_b.add(b);
        for(int j = 1; j <= b; j++)
        {
            if(b%j == 0)
            {
                Factor_b.add(j);
            }
        }
        for(int i = 0; i < Factor_a.size(); i++)
        {
            for(int j = 0; j < Factor_b.size(); j++)
            {
                if(Factor_a.get(i).equals(Factor_b.get(j)))
                {
                    Integer Common = Factor_a.get(i);
                    if(HigherstCF<Common)
                    {
                        HigherstCF = Common;
                    }
                }
            }
        }
        return HigherstCF;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.println(cal(a, b));
    }   
}
