import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);
    static int i = 0;

    public static void forSum() {
        System.out.println("number?");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("the sum is " + sum);
    }

    public static void rangeSum() {
        System.out.println("number?");
        int n = s.nextInt();
        System.out.println("number?");
        int n1 = s.nextInt();
        int x = 0;
        int y = 0;
        i = 0;
        while (i < n){
            i++;
            x = x + i;
        }
        int num = i;
        while (i < n1){
            i++;
            y = y + i;
        }
        System.out.println("range is " + (Math.abs(x - y) + Math.min(num,i)));
    }

    public static void factorial() {
        System.out.println("number?");
        int n = 1;
        int num = s.nextInt();
        i = 0;
        while (i < num){
            i++;
            n = n * i;
        }
        System.out.println("factorial: " + n);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
