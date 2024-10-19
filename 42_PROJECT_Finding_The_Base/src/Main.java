import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num, base;


        System.out.print("Please enter any number :");
        num = scan.nextInt();

        System.out.print("Please enter base number :");
        base = scan.nextInt();

        int a = 1;
        a = (int) (Math.log(num) / Math.log(base) + 1);

        int[] D = new int[a];

        for (int i = 0; i < a; i++) {
            int T = num % base;
            num = num / base;
            D[i] = T;

        }
        for (int i = a - 1; i >= 0; i--) {
            System.out.print(D[i] + " ");
        }


    }
}