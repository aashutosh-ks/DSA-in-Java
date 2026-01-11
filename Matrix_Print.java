import java.util.*;
public class Matrix_Print 
{
    static void Print(int[][] mat)
    {
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int[][] mat= new int[s][s];
    for(int i = 0; i < s; i++)
    {
        for(int j = 0; j < s; j++)
        {
            mat[i][j] = sc.nextInt();
        }
    }
    Print(mat);
 }   
}
