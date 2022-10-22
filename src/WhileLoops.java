import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);
    static int total = 0;
    static int even = 0;
    static int odd = 0;
    static int i =0;

    public static void eoCount() {
        System.out.println("Enter numbers to determine whether they're odd or even. Enter 0 to generate the mean of all entered numbers.");
        while ((i = s.nextInt()) != 0){
            if (i % 2 == 0){
                total = i + total;
                even++;
                System.out.println("Even");
            } else {
                total = i + total;
                odd++;
                System.out.println("Odd");
            }
        }
    }

    public static void mean() {
        System.out.println("Mean = " + total / (even + odd));
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
