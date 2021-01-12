import java.math.BigDecimal;
import java.util.Scanner;

public class Ciąg {


//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            long n = scanner.nextLong();
//
//            long result = fib(n);
//
//            if (result <= 0) {
//                throw new IllegalStateException("Result is 0, an illegal value.");
//            }
//
//            System.out.println(String.format("The result of %s is %s.", n, result));
//        }
//    }
//
//
//    private static long fib(long n) {
//        return n <= 0 ? 0 : (n == 1 || n == 2) ? 1 : fib(n - 1) + fib(n - 2);
//    }

    public static void main(String[] args) {

        Scanner numer = new Scanner(System.in);
        System.out.println("The value of the fibonacci sequence ");
        for (; ; ) {
            double n = numer.nextDouble();
            double wynik = Fib((long) n);
            System.out.println(wynik);
            System.out.print(new BigDecimal(wynik).toPlainString());
            System.out.println();


        }
    }


        private static double Fib(long n) {
            double prev = 1;
            double current = 1;
            if (n <= 0) { System.out.println("Error"); return 0;}
            if (n == 1 | n == 2) return 1;
            for (int i = 3; i <= n; i++) {
                double next = prev + current;
                prev = current;
                current = next;
            }
            return current;

        }


}
