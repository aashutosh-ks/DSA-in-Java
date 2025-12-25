import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("Valorant");
        stack.push("BGMI");
        stack.push("COC");
        stack.push("Badminton");
        stack.push("Cricket");

        //String myFavGame = stack.pop();

        //System.out.println(stack);
        //System.out.println(stack.peek());
        System.out.println(stack.search("Cricket"));
    }
}