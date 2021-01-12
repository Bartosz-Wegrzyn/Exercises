import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name, surname;
        int phone;
        System.out.println("Wprwoadź swoje Imię:");
        name = scanner.next();
        System.out.println("Wprwoadź swoje Nazwisko:");
        surname = scanner.next();
        System.out.println("Wprwoadź swój numer telefonu:");
        phone = scanner.nextInt();

        System.out.println("_________________________________");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(phone);
        System.out.println("_________________________________");

    }
}
