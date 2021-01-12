import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for (int J = 0; J < 100; J++) {
            for (int i = 0; i < 100; i++) {

                System.out.println("Podaj 3 liczby:");
                int a, b, c;
                a = s.nextInt();
                b = s.nextInt();
                c = s.nextInt();

                System.out.println("liczby w kolejności malejącej");

                if (a >= b && a >= c) {
                    System.out.println(a);
                    if (b > c) {
                        System.out.println(b);
                        System.out.println(c);
                        break;
                    } else if (c > b) {
                        System.out.println(c);
                        System.out.println(b);
                        break;
                    } else if (c == b) {
                        System.out.println(c);
                        System.out.println(b);
                        break;
                    }

                }

                if (b >= a && b >= c) {
                    System.out.println(b);
                    if (a > c) {
                        System.out.println(a);
                        System.out.println(c);
                        break;
                    } else if (c > a) {
                        System.out.println(c);
                        System.out.println(a);
                        break;
                    } else if (c == b) {
                        System.out.println(c);
                        System.out.println(b);
                        break;
                    }


                }

                if (c >= a && c >= b) {
                    System.out.println(c);
                    if (b > a) {
                        System.out.println(b);
                        System.out.println(a);
                        break;
                    } else if (a > b) {
                        System.out.println(a);
                        System.out.println(b);
                        break;
                    } else if (c == b) {
                        System.out.println(c);
                        System.out.println(b);
                        break;
                    }

                }


            }
        }
    }
}