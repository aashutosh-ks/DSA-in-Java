import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] words= s.split("\\s+");

        for( int i= words.length-1; i>=0; i--)
            {
            System.out.print(words[i] + " ");
        }
    }
}