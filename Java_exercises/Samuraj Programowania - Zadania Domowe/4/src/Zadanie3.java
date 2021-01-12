import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {
        System.out.println("Wprowadź punkty:");
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Styl:");
        a = scanner.nextInt();
        System.out.println("Efekty:");
        b = scanner.nextInt();
        System.out.println("Rezultat:");
        c = scanner.nextInt();

        double w = a*0.32+b*0.3+c*0.5;

        System.out.println("Wynik:" + w);


    }
}
