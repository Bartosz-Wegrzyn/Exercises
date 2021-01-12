import java.util.Scanner;

public class Main //jest to klasa Main, klasa musi mieć tą samą nazwę co nazwa pliku

  {

      private static final Scanner scanner = new Scanner(System.in);

      public static void main(String[] args) //to jest Metoda
      {

       //Zmienne liczbowe:
//       byte b = 127; //-128 do 127
//       short s = 9000; //-32768 do 32767
//       int i = -2147483648; // do 2147483647
//       long l =900000000000000000l; // w chuj dużo (kończy się małą literą "L"
//       float f = 3.4444444f; //-3,4*10^38 do 3,4*10^38  kończy się na litere  f
//       double d = 3.88739873987897; // -1,8* 10^108 do tego samego
//
//       //Zmienne znakowe
//       char c = 'a'; // tylko 1 litera, unicode
//       String string = "To jest jakiś dowolny tekst w jawie";
//
//       int
//               wynik1 = b+s,
//               wynik2 = b-s,
//               wynik3 = b*s,
//               wynik4 = b/s,
//               wynik5 = s/b,
//               wynik6 = b%s,
//               wynik7 = s%b;
//
//       float wynik8 = b/s;
//
//
//         System.out.println( wynik1);
//         System.out.println( wynik2);
//         System.out.println( wynik3);
//         System.out.println( wynik4);
//         System.out.println( wynik8);
//         System.out.println( wynik5);
//         System.out.println( wynik6);
//         System.out.println( wynik7);


//          Scanner scan = new Scanner(System.in);
//          int i = scan.nextInt();
//          double d = scan.nextDouble();
//          scan.nextLine();
//
//
//          String s = scan.nextLine();
//
//          // Write your code here.
//
//          System.out.println("String: " + s);
//          System.out.println("Double: " + d);
//          System.out.println("Int: " + i);
//


          int i = scanner.nextInt();
          for(int x = 1; x < 11; x++){
              System.out.println(i + " x "+  x +" = "+ i*x);      }

      }
  }
