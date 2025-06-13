public class Babylonian {
    static double root(double n)
    {
        double a = n/2;
        double b = n/a;
        while(a-b>=0.01)
        {
            b = n/a;
            a = (a+(n/a))/2;
        }
        return a;
    }
    public static void main(String[] args)
    {
        double n = 1002.0;
        System.out.println(root(n));
    }
}