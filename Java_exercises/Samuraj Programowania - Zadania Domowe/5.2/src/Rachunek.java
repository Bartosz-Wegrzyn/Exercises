public class Rachunek {

    private int money;

    public Rachunek (int money) {this.money = money;}

    public int getMoney(){return money;}

    public int setMoney(int a) { this.money = a + money; return money;}

    public int odj(){ return money;};


}
