public class Ćwiczenia {
    public static void main(String[] args) {

        String a = "*";


        for (int i = 1; i<15; i++ )
        {for (int j = 1; j<1+i; j++) {System.out.print("*");}   System.out.println("");}
        System.out.println("_____________________________________");

        int tab[] = new int [3];
        tab[0] = 11111;
        tab[1] = 111;
        tab[2] = 1111111;


        for (int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }
        System.out.println("_____________________________________");
        char e = 'a';
        char f = 'z';
        while (e<f){
            System.out.print(e);
            e++; }
        System.out.println("_____________________________________");

        int tabl[] = new int [10];
        tabl[0] =11 ;
        tabl[1] =22 ;
        tabl[2] =33;
        tabl[3] =44;
        tabl[4] =55;
        tabl[5] =66;
        tabl[6] =77;
        tabl[7] =88;
        tabl[8] =99;
        tabl[9] =110;

        for (int x:tabl){
        System.out.println(x);}
    }
}
