public class TV {

    private int size;
    private String name;
    private boolean onOff;

    public TV(int aSize, String name)
    {
        size = aSize;
        this.name = name;

    }

    public int getSize() {
        return size;
    }
    public String getName(){
        return name;
    }
    public void setOnOFF (boolean a)
    {
        onOff = a;
    }
    public void getonOff ()
    {
        if(onOff) {
            System.out.println("TV is on");
        }
        else
            System.out.println("TV is off");
    }

}
