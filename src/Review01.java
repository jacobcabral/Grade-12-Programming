import java.text.DecimalFormat;

public class Review01 {
    public static void main(String[] args) {
        int a = 1;
        double b = 2.3;
        boolean c  = true;
        char d = 'd';
        short e = 5;
        long f = 2;
        byte g = 10;
        float h = 3;
        double dd = 5565;

        String name = "John Doe";

        int iBottlepack = 12;
        double dBottlecost = 3.5;
        String sBrandName = "Pure Life";

        iBottlepack = 24;
        dBottlecost = 4.5;
        sBrandName = "Selection Natural Spring Water";

        DecimalFormat format = new DecimalFormat("##.##");

        System.out.println("The cost of a single bottle of water is $" + format.format(dBottlecost/iBottlepack));

        for (int i = 0; i <= 24 ; i++) {
            System.out.println("The cost of " + i + " bottles of water is $" + format.format(i*dBottlecost/iBottlepack));
        }

        int[] bottlenumber;
        bottlenumber = new int[100];

        for (int j = 0; j <= 100 ; j++) {
            System.out.println("The cost of " + j + " bottles of water is $" + format.format(j*dBottlecost/iBottlepack));
        }
        //a do while loop can be used to navigate through an array


    }
}
