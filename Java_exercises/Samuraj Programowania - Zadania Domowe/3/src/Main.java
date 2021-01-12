import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args)
    {
        int tab[] = new int [6];
        tab[0] = 12;
        tab[1] = 13;
        tab[2] = 14;
        tab[3] = 15;
        tab[4] = 16;

        for (int i=0; i<tab.length; i++){
        System.out.println("element tablicy " + tab[i]);
        }

        for (int x:tab){
            System.out.println(x); }

        System.out.println("");
////////////////////////////////////////////////////////////////////////////////////////////////////
        int n= 10;

        while (n>=0){
            System.out.println(n);
            n--; }




    }
}
