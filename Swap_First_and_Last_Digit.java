import java.util.*;
public class Swap_First_and_Last_Digit 
{
    static int Num(int x)
    {
        int first;
        int last;
        int rem = 0;
        int n = 0;
        ArrayList<Integer> Digits = new ArrayList<>();
        while(x > 0)
        {
            rem = x%10;
            x = x/10;
            Digits.add(rem);
        }
        first=Digits.get(Digits.size()-1);
        last = Digits.get(0);
        Digits.set(0, first);
        Digits.set(Digits.size()-1, last);
        for(int i = Digits.size() - 1; i>=0; i-- )
        {
            n = n*10 + Digits.get(i);
        }
        return n;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int x = sc.nextInt();
        System.out.println(Num(x));
    }
}
