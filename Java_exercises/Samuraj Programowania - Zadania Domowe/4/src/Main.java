import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int a = 10;


        if (a<10)
            System.out.println("4<5");
        else if (a==10)
            System.out.println("a==10");
        else if (a==9)
            System.out.println("a==10");
        else if (a==8)
            System.out.println("a==10");
        else
            System.out.println("a>10");

        int b = 4;

        switch (b)
        {
                case 1:
                System.out.println("b=1"); break;
                case 2:
                System.out.println("b=2"); break;
                  case 3:
                System.out.println("b=3");break;
                  case 4:
                System.out.println("b=4");break;
                  case 5:
                System.out.println("b=5");break;
                  case 6:
                System.out.println("b=6");break;

            default:
                System.out.println("default");

        }

        int c = 10, d;
        d = c <=10 ? -1 : 1;
        System.out.println(d);

        for (int i = 0; i<10; i++ )

        {
            if (i==5)
                break;
            System.out.print(i + " ");

        }

        System.out.println(" ______");

        for(int Ł = 0; Ł<10; Ł++) {
            if (Ł % 2 == 0) continue;
            System.out.println(Ł + " parzysta");


        }

        Scanner scan = new Scanner(System.in);

        String name = scan.next();

        System.out.println(name);



}}

