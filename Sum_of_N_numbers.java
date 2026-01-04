import java.util.*;

public class Sum_of_N_numbers
{
    static int Addition(int[] Store)

    {
        int Sum =0;
        for(int j=0; j<Store.length; j++)
        {
            Sum += Store[j];
        }
        return Sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of numbers you want the sum of : ");
        int count = sc.nextInt();

        int[] Store= new int[count];
        for(int i=0; i<count; i++)
        {
            System.out.println("enter number : ");
            Store[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("The Sum of all numbers is : " + Addition(Store));

    }
}