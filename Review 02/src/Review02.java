import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Review02 {
    public static void main(String[] args) {
        String notes = "ABCDEFG";
        char c = notes.charAt(2);
        char d = notes.charAt(3);
        char e = notes.charAt(4);
        char f = notes.charAt(5);
        char g = notes.charAt(6);
        char a = notes.charAt(0);
        char b = notes.charAt(1);

        System.out.println("The key of C is: " + c + d + e + f + g + a + b);
        int males = 0;
        int females = 0;
        String[] vocalists;
        vocalists = new String[6];
        vocalists[0] = "Beyonce (f)";
        vocalists[1] = "David Bowe (m)";
        vocalists[2] = "Elvis Costello (m)";
        vocalists[3] = "Madonna (f)";
        vocalists[4] = "Elton John (m)";
        vocalists[5] = "Charles Anzavour (m)";

        for (int i = 0; i <vocalists.length ; i++) {
            if(vocalists[i].contains("(m)")){
                males++;
            }
            else{
                females++;
            }

        }
        System.out.println("The number of male vocalists is " + males + " and the number of female vocalists is " + females);

        String[] instruments = new String[4];
        instruments[0] = "cello";
        instruments[1] = "guitar";
        instruments[2] = "violin";
        instruments[3] = "double bass";

        for (int o = 0; o <instruments.length ; o++) {
            System.out.println(instruments[o].replaceAll("[AEIOUaeiou]",""));
        }
        int isDivisible = 0;
        int isNotDivisible = 0;



        for (int k = 0; k <100 ; k++) {

          if (k%3==0){
              isDivisible++;
          }
          else {
              isNotDivisible++;
          }

        }
        System.out.println("There are " + isDivisible + " divisible by 3 and " + isNotDivisible + " not divisible by 3");

        int[] single = new int[20];
        int[] doubles = new int [20];
        int[] triple = new int[20];

        for (int r = 0; r <20 ; r++) {
            single[r] = (single[r]);
            doubles[r] = (doubles[r]*2);
            triple[r] = (triple[r]*3);
        }

        int dim = 8;
        for (int i = 0; i < dim * dim; i++) System.out.print((i % dim == 0 ? "\n" : "") + ((i / dim) % 2 == 0 ? i % 2 == 0 ? 'B' : 'W' : i % 2 == 0 ? 'W' : 'B') + " ");

        System.out.println();
        System.out.println();

        String sNumbers = "10-9-8-7-6";

        //coonvert to peices
        String[] parts = sNumbers.split("-");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        String part4 = parts[3];
        String part5 = parts[4];

        //make the peices ints
       int pos0 =  Integer.parseInt(part1);
       int pos1 =  Integer.parseInt(part2);
       int pos2 =  Integer.parseInt(part3);
       int pos3 =  Integer.parseInt(part4);
       int pos4 =  Integer.parseInt(part5);




       if ((pos0-pos1==1) && (pos1-pos2==1) && (pos2-pos3==1) && (pos3-pos4==1)){
           System.out.println("The numbers are consecutive");
       }
       else{
           System.out.println("The numbers are not consecutive");
       }
        System.out.println();
        if (pos0 == pos1){
            System.out.println("pair detected");
        } else if (pos0 == pos2){
            System.out.println("pair detected");
        }else if (pos0 == pos3){
            System.out.println("pair detected");
        }else if (pos0 == pos4){
            System.out.println("pair detected");
        }else if (pos1 == pos2){
            System.out.println("pair detected");
        }else if (pos1 == pos3){
            System.out.println("pair detected");
        }else if (pos1 == pos4){
            System.out.println("pair detected");
        }else if (pos2 == pos3){
            System.out.println("pair detected");
        }else if (pos2 == pos4){
            System.out.println("pair detected");
        }else if (pos3 == pos4){
            System.out.println("pair detected");
        }


        System.out.println("D");
        System.out.println(" I");
        System.out.println("  A");
        System.out.println("   G");
        System.out.println("    O");
        System.out.println("     N");
        System.out.println("      A");
        System.out.println("       L");
        System.out.println("        L");
        System.out.println("         Y");

        System.out.println();

        String teams = "Manchester United 1 Chelsea 0, Manchester United 1 Arsenal 1 , Manchester United 3 Fulham 1, Manchester United 1 Liverpool 2, Manchester United 4 Swansea 2 ";
        String[] games = teams.split(",");
        String[] nums = new String[5];
        int[] iMscore = new int[5];
        int[] iOscore = new int[5];
        int wins = 0;
        int draws = 0;
        int losses = 0;
        int home = 0;
        int away = 0;
        int points = 0;
        for (int i = 0; i < games.length; i++) {
            nums[i] = games[i].replaceAll("[^0-9]", "");
            iMscore[i] = Integer.parseInt(nums[i].substring(0,1));
            iOscore[i] = Integer.parseInt(nums[i].substring(1,2));
        }


        for (int i = 0; i < 5; i++) {
            if(iMscore[i] > iOscore[i]){
                wins++;
            }
            else if(iMscore[i] == iOscore[i]){
                losses++;
            }
            else{
                draws++;
            }
        }
        for (int i = 0; i < iMscore.length; i++) {
            home += iMscore[i];
            away += iOscore[i];
        }


        points = wins * 3 + draws;
        System.out.println("Number of Wins = " + wins);
        System.out.println("Number of Draws = " + draws);
        System.out.println("Number of Losses = " + losses);
        System.out.println("Goals For = " + home);
        System.out.println("Goals Against = " + away);
        System.out.println("Number of Points = " + points);











    }
}
