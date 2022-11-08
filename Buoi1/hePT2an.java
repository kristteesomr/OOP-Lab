public class hePT2an {
    //x = de-bf / ad-bc
//y = af-ce / ad-bc
//det = ad-bc
    public static void solveSimultaneousEquations(double a, double b, double c, double d, double e, double f) {
        double det = ((a) * (d) - (b) * (c));  //instead of 1/
        double x = ((d) * (e) - (b) * (f)) / det;
        double y = ((a) * (f) - (c) * (e)) / det;
        System.out.print("x=" + x + " y=" + y);
    }

    public static void main(String args[])
    {
        solveSimultaneousEquations(2,4,5,3,7,5);
        System.exit(0);
    }
}
