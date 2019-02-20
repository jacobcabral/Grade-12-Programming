import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        RepeatPhrase("Howdy",1);
        RepeatPhrase("There",2);
        RepeatPhrase("Pardner",3);

        System.out.println("------------------------------");
        for (int iLoop = 1; iLoop <=12; iLoop++) {
            System.out.println(Random1to6());
        }
        System.out.println("------------------------------");
        for (int iLoop = 1; iLoop <=20 ; iLoop++) {
            System.out.println(Random1To52());
        }
        System.out.println("------------------------------");
        for (int iLoop = 1; iLoop <=20 ; iLoop++) {
            System.out.println(RandomRange(13,22));
        }

        if (PromptYN("Should I continue?"))
            System.out.println("Yes You Should!");
        else
            System.out.println("No you should not!");
    }
}

public static void RepeatPhrase (String sPhrase, int iCount)
{
    while (iCount-- > 0){
        System.out.println(sPhrase);
    }

}

public static int Random1to6 ()
{
    int iRandom;
    iRandom = (int) (Math.random() * 6 + 1);
    return iRandom;
}

public static int Random1To52 ()
{
    return (int) (Math.random() * 52 + 1);
}

public static int RandomRange (int iLow, int iHigh)
{
        return (int) (Math.random() * (iHigh - iLow + 1) + iLow);
}

    public static boolean PromptYN (String sPromptPhrase)
    {
        boolean bYN = false,
                bValidResponse = false;
        String sResponse;
        Scanner sc = new Scanner (System.in);
        while (!bValidResponse){
            System.out.print (sPromptPhrase + " ");
            sResponse = sc.nextLine();
            sResponse = sResponse.toUpperCase();
            if ("Y~YE~YES~N~NO".indexOf(sResponse) >= 0){
                bValidResponse = true;
                bYN = ("Y~YE~YES".indexOf(sResponse) >= 0);
            }
        }
        return bYN;
    }
}


