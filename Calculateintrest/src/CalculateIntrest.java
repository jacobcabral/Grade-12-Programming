import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Month;

public class CalculateIntrest {
    private static String[] data;
    private static BufferedReader in = null;
    private static PrintWriter out = null;
    private static String[] sAccountTypes = {"CMI","CDI","SMI","SDI","STF"};
    private static double interestRates[] = { 0.5, 0.25, 2.25, 2.0, 2.5};

    public static void openFiles () throws java.io.IOException{
    in = new BufferedReader(new FileReader("C:\\Users\\Jake\\Desktop\\CalculateInterest\\Project01Data.txt"));
    out = new PrintWriter(new FileWriter("C:\\Users\\Jake\\Desktop\\CalculateInterest\\MonthlyAccountInterest.txt"));
}
    public static void closeFiles ()throws java.io.IOException{
        out.close();
        in.close();
    }


}
