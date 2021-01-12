import java.util.Scanner;

public class Cwicznie {
    public static void main(String[] args) {

        int num = 0;

        for (int t = 0; t>-1; t++) {
         //   Scanner myObj = new Scanner(System.in);  // Create a Scanner object
          //  System.out.println("Podaj liczbę:");
          //  int a = Integer.parseInt(myObj.nextLine());  // Read user input

            num++;
            boolean flag = false;
            for(int i = 2; i <= num/2; ++i)
            {
                // condition for nonprime number
                if(num % i == 0)
                {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println("       " + num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }
}