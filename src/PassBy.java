public class PassBy
{
    public static void main(String [] args)
    {
        int x = 999;
        int[] y = {888};

        System.out.println(x);
        zero(x);
        System.out.println(x);

        System.out.println(y[0]);
        zero(y[0]);
        System.out.println(y[0]);

        System.out.println(y[0]);
        zero(y);
        System.out.println(y[0]);

    }

    public static void zero(int x)
    {
        x = 0;
    }

    public static void zero(int [] y)
    {
        y[0] = 0;
    }

}