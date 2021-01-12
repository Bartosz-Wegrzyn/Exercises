public class Home {

    public static void main (String args[])
    {





        TV nosy = new TV(45, "nosy124");
    TV sama = new TV(32, "sama1234");

        System.out.println(sama.getName() + " " + sama.getSize());
        System.out.println(nosy.getName() + " " + nosy.getSize());

        sama.getonOff();
        sama.setOnOFF(true);
        sama.getonOff();

        Dog rex = new Dog();
        rex.głos();
        rex.setRozmiar(12);
        System.out.println(rex.getRozmiar());
       // rex.getRozmiar()






    }
}
