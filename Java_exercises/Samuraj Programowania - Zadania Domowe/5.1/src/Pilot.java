import java.time.ZoneOffset;
import java.util.Scanner;

public class Pilot {

    public static void main(String[] args) {
        // on/of (przyciski programów od 1 do 9, głośność góra dół, program góra dół zapentlony  )
        int ml;
        int Ch;


        Scanner scanner = new Scanner(System.in);


        TV a = new TV ();

        a.getonOff();
        System.out.println("__________");
        System.out.println("| o       |");
        System.out.println("|         |");
        System.out.println("| 9  8  7 |");
        System.out.println("| 6  5  4 |");
        System.out.println("| 3  2  1 |");
        System.out.println("|         |");
        System.out.println("| +     > |");
        System.out.println("| _     < |");
        System.out.println("|         |");
        System.out.println("|         |");
        System.out.println("__________");

        for (int i = 1; true;) {
           // System.out.println(a.poka());
            String x = scanner.nextLine();


            if (a.poka() == false && !x.equals("o")) {
               // System.out.println("a");
            } else {


                if (x.equals("1")) {
                    a.setChl(1);
                    System.out.println("Zmieniono na kanał: " + a.getChl());
                }
                if (x.equals("2")) {
                    a.setChl(2);
                    System.out.println("Zmieniono na kanał: " + a.getChl());
                }
                if (x.equals("3")) {
                    a.setChl(3);
                    System.out.println("Zmieniono na kanał: " + a.getChl());
                }
                if (x.equals("4")) {
                    a.setChl(4);
                    System.out.println("Zmieniono na kanał: " + a.getChl());
                }
                if (x.equals("5")) {
                    a.setChl(5);
                    System.out.println("Zmieniono na kanał: " + a.getChl());
                }
                if (x.equals("6")) {
                    a.setChl(6);
                    System.out.println("Zmieniono na kanał: " + a.getChl());
                }
                if (x.equals("7")) {
                    a.setChl(7);
                    System.out.println("Zmieniono na kanał: " + a.getChl());
                }
                if (x.equals("8")) {
                    a.setChl(8);
                    System.out.println("Zmieniono na kanał: " + a.getChl());
                }
                if (x.equals("9")) {
                    a.setChl(9);
                    System.out.println("Zmieniono na kanał: " + a.getChl());
                }

                if (x.equals("o")) {

                    if (a.poka() == true)
                        a.setOnOff(false);
                    else a.setOnOff(true);
                    a.getonOff();
                }
                if (x.equals("+")) {

                    if (a.getMl() + 1 <= 30){
                    a.setMl(a.getMl() + 1);
                    System.out.println("Głośność: " + a.getMl());}
                    else
                    System.out.println("Głośność: " + a.getMl());
                }
                if (x.equals("-")) {
                    if (a.getMl() - 1 >= 0){
                        a.setMl(a.getMl() - 1);
                        System.out.println("Głośność: " + a.getMl());}
                    else
                        System.out.println("Głośność: " + a.getMl());
                }
                if (x.equals(">")) {
                    if (a.getChl() + 1 > 30) {
                        a.setChl(1);
                        System.out.println("Zmieniono na kanał: " + a.getChl());
                    } else {
                        a.setChl(a.getChl() + 1);
                        System.out.println("Zmieniono na kanał: " + a.getChl());
                    }
                }
                if (x.equals("<")) {
                    if (a.getChl() - 1 == 0) {
                        a.setChl(30);
                        System.out.println("Zmieniono na kanał: " + a.getChl());
                    } else {
                        a.setChl(a.getChl() - 1);
                        System.out.println("Zmieniono na kanał: " + a.getChl());
                    }
                }
            }

        }








    }



}
