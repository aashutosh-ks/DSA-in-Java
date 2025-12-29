import java.util.*;
public class Queue_Basics 
{
    public static void main(String[] args)
    {
        Queue<String> queue=new LinkedList<String>();

        queue.offer("harry");
        queue.offer("toddy");
        queue.offer("teddy");
        queue.offer("ram");
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.contains("ram"));
        System.out.println(queue.isEmpty());
    }
}
