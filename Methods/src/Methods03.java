import java.util.Scanner;

public class Methods03 {

    public static boolean inRange (int value, int low, int high)
    {
        return ((value >= low) && (value <= high));
    }

    public static boolean inRange (long value, long low, long high)
    {
        return ((value >= low) && (value <= high));
    }

    public static boolean inRange (short value, short low, short high)
    {
        return ((value >= low) && (value <= high));
    }

    public static boolean inRange (byte value, byte low, byte high)
    {
        return ((value >= low) && (value <= high));
    }

    public static boolean inRange (float value, float low, float high)

    {
        return ((value >= low) && (value <= high));
    }

    public static boolean inRange (double value, double low, double high)
    {
        return ((value >= low) && (value <= high));
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int iAge;
        iAge = sc.nextInt();

        System.out.println(inRange(iAge,13,65) ? "Your ticket costs 10.50" : "Your ticket costs 7.99");
        System.out.println(inRange(iAge,0,17) ? "You cannot vote in an election" : "You can vote in an election");
        System.out.println(inRange(iAge,0,18) ? "Sorry, no party for you" : "You are of the age to buy alcohol");
        System.out.println(inRange(iAge,0,59) ? "You cannot collect pension benefits" : "You can collect pension benefits");
        System.out.println(inRange(iAge,0,13) ? "You can't collect employment insurance" : "You can collect employment insurance");
        System.out.println(inRange(iAge,0,15) ? "You can't get a drivers licence in Ontario" : "You can get a drivers licence in Ontario");
        System.out.println(inRange(iAge,0,13) ? "You can't get a drivers licence in Alberta" : "You can get a drivers licence in Alberta");
        System.out.println(inRange(iAge,0,16) ? "You can't join the army" : "You can join the army");
        System.out.println(inRange(iAge,0,9) ? "You can't stay home alone" : "You can stay home alone");
        System.out.println(inRange(iAge,0,12) ? "You can't supervise your siblings" : "You can supervise your siblings");
        System.out.println(inRange(iAge,0,17) ? "You can get a tattoo with parental consent" : "You can get a tattoo without parental consent");
        System.out.println(inRange(iAge,0,10) ? "You can't rent a car in Ontario" : "You can rent a car in Ontario");
        System.out.println(inRange(iAge,0,13) ? "You can't get a student pilot permit in Canada" : "You can get a student pilot permit in Canada16");
    }

}
