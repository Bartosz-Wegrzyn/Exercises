public class ćwiczenie {
    public static void main(String[] args) {
        int z1 = 15, z2 = 5, z3=z1-z2;

        System.out.println("15+5=" + z1+z2);
        System.out.println("15-5=" + z3);
        System.out.println("15*5=" + z1*z2);
        System.out.println("15/5=" + z1/z2);
        System.out.println("15%5=" + z1%z2);

        char letter = 1;

        //while (letter<30){
          //  System.out.println(letter);
            //letter++;}
        System.out.println("---------------------------");

        int a = 1;
        while (letter<10) {
            System.out.println("znak " + a + ": " + letter);
        letter++;
        a++;
        }
        System.out.println("---------------------------");

        double d = 10.123456789;
        d++;
        System.out.println(d);

        for (int i=0; i<150; i++){
            System.out.println(d);
            d++;
        }
        System.out.println("---------------------------");

        String w = "wynikiem wartosci dodawania liczby 2 i 2 jest:";
        int s = 2 ;
        System.out.println(s+s);

        System.out.println("---------------------------");

        Double pi = 3.14157;
        int r = 42;

        double pole = Math.PI*r*r;
        double obwód =Math.PI*2*r;
        //PI r^2

        System.out.println("Pole koła "+pole);
        System.out.println("Powieszchnia koła "+obwód);





    }

}
