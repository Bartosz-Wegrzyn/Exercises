import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int l, r;

        System.out.println("Wprowadz tekst:");
        String tek = scanner.nextLine();
        System.out.println("Wydrukować dany tekst? 1 - tak, 2 - nie");
        l = scanner.nextInt();


                if(l == 1){
                    System.out.println("Ile razy wydrukować tekst?");
                    r = scanner.nextInt();

                    for (int i = 1; i<=r; i++)
                        System.out.println(i + tek);}

                 else if(l==2)
                        System.out.println("Dzięki mordo. narazie");
                 else
                        System.out.println("1 albo 2 ? czego nie rozumiesz ? ._.");
    }
}
