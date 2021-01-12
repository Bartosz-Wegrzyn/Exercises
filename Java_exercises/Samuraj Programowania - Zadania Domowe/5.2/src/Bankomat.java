import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {

        Rachunek Client = new Rachunek(0);
        Rachunek A = new Rachunek(1000);
        Rachunek B = new Rachunek(2000);
        Rachunek C = new Rachunek(3000);
        Rachunek D = new Rachunek(4000);
        Karta Bartek = new Karta(0);



        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i > -1; ) {
            for (int j = 0; j > -1; ) {

                System.out.println("Witam! Prosze wlozyc karte");
                int k = scanner.nextInt();
                Client.setMoney(-Client.getMoney());

                switch (k) {
                    case 111:
                        Client.setMoney(A.getMoney()); A.setMoney(-A.odj()); Bartek.setCode(1);
                        j = -1;
                        break;
                    case 222:
                        Client.setMoney(B.getMoney());B.setMoney(-B.odj()); Bartek.setCode(2);
                        j = -1;
                        break;
                    case 333:
                        Client.setMoney(C.getMoney());C.setMoney(-C.odj()); Bartek.setCode(3);
                        j = -1;
                        break;
                    case 444:
                        Client.setMoney(D.getMoney());D.setMoney(-D.odj()); Bartek.setCode(4);
                        j = -1;
                        break;
                    default:
                        System.out.println("Karta nieprawidlowa. Wprowadz karte ponownie");
                }
            }


                System.out.println("Karta zaakceptowana witaj kliencie: "+Bartek.getCode()+" jaką czynnosc wykonac?");

                for (int o = 1; o > 0; o++) {
                    System.out.println("Jaką czynność wykonać?");
                    System.out.println("1 - Wypłać pieniądze. 2 - Wpłać pieniądze. 3 - Sprawdż stan konta. 4 - Anuluj");
                    int w = scanner.nextInt();

                    switch (w) {
                        case 1:
                            System.out.println("Ile pieniędzy chcesz wypłacić? ");
                            int a = scanner.nextInt();
                            if (Client.getMoney() < a) {
                                System.out.println("Nie masz tyle pieniędzy!");
                                break;
                            } else
                                System.out.println("Pieniądze wypłacone");
                            Client.setMoney(-a);
                            break;


                        case 2:
                            System.out.println("Ile pieniędzy chcesz wpłacić?");
                            int b = scanner.nextInt();
                            Client.setMoney(b);

                            break;

                        case 3:
                            System.out.println("Twoje saldo to: " + Client.getMoney());
                            break;
                        case 4:

                            switch (Bartek.getCode()) {
                                case 1:   A.setMoney(Client.getMoney()); Client.setMoney(-Client.odj()); break;
                                case 2:   B.setMoney(Client.getMoney()); Client.setMoney(-Client.odj()); break;
                                case 3:   C.setMoney(Client.getMoney()); Client.setMoney(-Client.odj()); break;
                                case 4:   D.setMoney(Client.getMoney()); Client.setMoney(-Client.odj()); break;
                            }

                            System.out.println("Dziękujemy, zapraszamy ponownie!");

                            break;
                        case 5:
                        default:
                    }
                    if (w == 4) o = -1;


                }
        }
    }
}
