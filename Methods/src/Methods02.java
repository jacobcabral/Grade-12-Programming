public class Methods02 {
    public static void out (int iNumberToPrint)
    {
        System.out.print(iNumberToPrint);
    }

    public static void out (double dNumberToPrint)
    {
        System.out.print(dNumberToPrint);
    }

    public static void out (String sStringToPrint)
    {
        System.out.print(sStringToPrint);
    }

    public static void outln (int iNumberToPrint)
    {
        System.out.println(iNumberToPrint);
    }

    public static void outln (double iNumberToPrint)
    {
        System.out.println(iNumberToPrint);
    }

    public static void outln (String sStringToPrint)
    {
        System.out.println(sStringToPrint);
    }

    public static void testPrimeNumber (int iNumberToTest)
    {
        boolean nonPrime = false;
        for(int i = 2; i <= iNumberToTest/2; ++i)
        {
            // nonprime
            if(iNumberToTest % i == 0)
            {
                nonPrime = true;
                break;
            }
        }

        if (!nonPrime)
            System.out.println(iNumberToTest + " is a prime number.");
        else
            System.out.println(iNumberToTest + " is not a prime number.");
    }

    public static void isPrimeNumber (int iNumberToTest) {
        boolean nonPrime = false;
        for (int i = 2; i <= iNumberToTest / 2; ++i) {
            // nonprime
            if (iNumberToTest % i == 0) {
                nonPrime = true;
                break;
            }
        }
        if (nonPrime = true){
            System.out.println("number is not prime");
        }
        else {
            System.out.println("Number is prime");
        }

    }

    public static void main(String[] args) {
        out("I will be paid on Friday the ");
        out(23);
        out("rd day of September.");
        out("I expect to be paid ");
        out(234.56);

        System.out.println();

        outln("Today is the ");
        outln(16);
        outln("th day of may.");
        outln("It's my birthday! ");

        testPrimeNumber(15);

        isPrimeNumber(5);

    }


}
