import java.util.*;
public class Simple_Interest 
{
    static int SI(int P, int R, int T)
    {
        return (P*R*T)/100;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        int P = sc.nextInt();
        System.out.print("Enter Rate of interest : ");
        int R = sc.nextInt();
        System.out.print("Enter Tenure(in Years) : ");
        int T = sc.nextInt();
        System.out.println(SI(P, R, T));
    }
}
