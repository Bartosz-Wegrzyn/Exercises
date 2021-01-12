import java.util.Scanner;

public class Kwadrat {

    public static void main(String[] args) {

        for(;;) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj liczbę:");
            int x = scanner.nextInt();
            System.out.println("Podnieś ją do potęgi:");
            int y = scanner.nextInt();

            try {
                double wynik = Potega_rekurencyjnie(x, y);
                // long wynik = Potega(x, y);
                System.out.println(wynik);
            }catch (StackOverflowError e){
                System.out.println("Too large");
            }



        }
    }

   private static long Potega(int x, int y) {

        long wynik=1;
        for (int z = y ; z>0; z--){ wynik *= x;}
        return wynik;
   }


   private static double Potega_rekurencyjnie(int x, int y) {

        if (y == 0) return 1;
        else return x*Potega_rekurencyjnie(x, y-1);
   }





}
