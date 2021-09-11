import java.util.Scanner;

public class FindFactorial {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int i = scan.nextInt();
        System.out.printf("%d! = %d\n", i, factorial(i));
    }
}
