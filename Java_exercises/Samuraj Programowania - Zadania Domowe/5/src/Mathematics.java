public class Mathematics
{
    public static void main (String args[])
    {
        Mathematics m = new Mathematics();
        m.className();
        System.out.println(m.sqrt(5));
        System.out.println(m.sqrt(6));
        System.out.println(m.sqrt(8));
        System.out.println(m.sqrt(11.33));
        System.out.println(m.sqrt(8.75));
        System.out.println(m.sqrt(8.4));
    }

    public void className()
    {
        System.out.println("mathematics");
    }

    public int sqrt (int a)
    {
        return a*a;

    }

    public double sqrt (double a)
    {
        return a*a;

    }
}
