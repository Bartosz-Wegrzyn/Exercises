import java.util.Scanner;

public class Zadanie {


    public static void main (String args[]) {
        System.out.print("wprowadz 3 cyfry");

        int a, b, c;
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        a = scanner.nextInt();
        System.out.print("b=");
        b = scanner.nextInt();
        System.out.print("c=");
        c = scanner.nextInt();

        System.out.println("czy te liczby mogą utworzyc 3kąt ?");

       if(a+b>c&&b<a+c&&a<b+c )  {
           System.out.println("tak");
       }else System.out.println("nie");


    }





}
