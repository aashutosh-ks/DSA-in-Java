import java.util.*;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class Queue_Dynamic 
{
    public static void main(String[] args)
    {
        Queue<String> Queue = new LinkedList<>();
            System.out.println("Enter no. of elements in queue : ");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i <n; i++)
        {
            System.out.println("Enter Element : ");
            String name = sc.nextLine();
            Queue.offer(name);
        }
        System.out.println(Queue);

    }   
}
