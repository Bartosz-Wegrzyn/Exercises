public class Main {

    public static int m =999;

    public static void main(String[] args) {



        int [] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9,};



        System.out.println("Input: "); print_arr(a);
        System.out.println();
        System.out.println();

        System.out.println("Max num: ");
        System.out.println(max(a));


        System.out.println();
        System.out.print("Sort: ");

        System.out.println();
       // print_arr(sort(a));

        System.out.println();



    }

    static int max(int a[]){
        m = a[0];
        for (int i = 0; i<a.length-1; i++){
        if (m<a[i+1]) {m=a[i+1];}
            System.out.println();print_arr(a);System.out.println();

        }
     return  m;
    }

    static int[] sort(int[] a){
        int[] b = new int[a.length];


           b[0] =  max(a);
           b[1] =  max(a);
           b[2] =  max(a);
           b[3] =  max(a);
           b[4] =  max(a);
           b[5] =  max(a);
           b[6] =  max(a);
           b[7] =  max(a);
           b[8] =  max(a);




        return b;
    }

    static void print_arr(int[] a){
        for(int z: a)
            System.out.print(z+ " ");

    }
}
