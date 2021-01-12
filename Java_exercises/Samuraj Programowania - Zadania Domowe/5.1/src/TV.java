public class TV {

    boolean onOff;
    int ml = 5; //music level
    int ch = 1; //chanel

    public int getMl(){return ml;}
    public void setMl(int ml){this.ml=ml;}

    public int getChl(){return ch;}
    public void setChl(int ch){this.ch=ch;}





    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public boolean poka(){return onOff;}

    public void getonOff () {
        if (onOff){
            System.out.println("TV is on");
        }
        else
            System.out.println("TV is off");
    }






}
