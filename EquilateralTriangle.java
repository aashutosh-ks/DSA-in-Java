import java.util.*;

public class EquilateralTriangle {

    public static void pattern(int n) {

        for (int i = 1; i <= n; i++) {

            // print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}
