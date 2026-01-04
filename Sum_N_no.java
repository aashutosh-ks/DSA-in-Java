import java.util.*;

public class Sum_N_no {
    static int Addition(int[] Store)
    {
        int Sum=0;
        for(int j=0; j<Store.length; j++)
        {
            Sum += Store[j];
        }
        return Sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of numbers : ");
        int count = sc.nextInt();

        int[] Store = new int[count];
        for(int i =0; i<count; i++)
        {
            System.out.println("Enter "+ (i+1) +"Number : ");
            Store[i]=sc.nextInt();
            sc.nextLine();
        }
    }
    
}
