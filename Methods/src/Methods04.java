import java.awt.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Methods04<string> {
    private static String scores;
    private static String[] sNumber = new String[14];
    private static String[] sResponses = new String[14];
    private static String correct = "    FTFFTFFTFT";
    private static char rt = 'T';
    private static char rf = 'F';
    private static int[] sScores = new int [14];
    private static char[] grades = new char[14];
    private static int[] qcount = new int [11];
    private static int A;
    private static int B;
    private static int C;
    private static int F;





    public static void readFile () throws FileNotFoundException {
        File text = new File("C:\\Users\\Jacob\\Desktop\\Grade-12-Programming\\Methods\\ExamDataFile.txt");

        Scanner scnr = new Scanner(text);

        int i = 0;
        //store the information in the array
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            sNumber[i] = line.substring(0,4);
            sResponses[i] = line.substring(5,14);

            //assign scores
            for (int j = 5; j <=13  ; j++) {
               if ( line.charAt(j) == correct.charAt(j)){
                   sScores[i]++;
                   qcount[j-4]++;
               }

            }
            i++;
        }
        //assigning grades
        for (int k = 0; k <=13 ; k++) {
            grades[k] = 'F';
            if (sScores[k] >= 9) {
                grades[k] = 'A';
                A++;
            } else if (sScores[k] == 8) {
                grades[k] = 'B';
                B++;
            } else if (sScores[k] == 7) {
                grades[k] = 'C';
                C++;
            } else{
                F++;
            }

        }
//creating the table
        for (int l = 0; l <sNumber.length; l++) {
            System.out.print("Student Number: " + sNumber[l] + " | ");
            System.out.print("Score: : " + sScores[l] + " | ");
            System.out.println("Grade: " + grades[l]);

        }

    }
    //largest answer
    static int largest() {
        int counter;


        int max = sScores[0];


        for (counter = 0; counter < sScores.length; counter++)
            if (sScores[counter] > max)
                max = sScores[counter];

        return max;
    }
    //smallest answer
    static int smallest(){
        int counter;


        int min = sScores[0];


        for (counter = 0; counter < sScores.length; counter++)
            if (sScores[counter] < min)
                min = sScores[counter];

        return min;

    }


    public static void getMostFrequentGrade(){
        if (A > B && A > C)
            System.out.println("A");
        else if (B > A && B > C)
            System.out.println("B");
        else if (C > A && C > B)
            System.out.println("C");
        else
            System.out.println("F");

    }

    public static int bestanswered(){
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i <qcount.length ; i++) {
            al.add(qcount[i]);
        }
        int max = Collections.max(al);
        return al.indexOf(max) + 1;
    }

    public static int worstanswered(){
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i <qcount.length ; i++) {
            al.add(qcount[i]);
        }
        int min = Collections.min(al);
        return al.indexOf(min) + 1;
    }



    private static void staistics(){
        int average = 0;
        for (int g = 0; g <qcount.length ; g++) {
            average += qcount[g];
        }
        System.out.println("Number of people who wrote the exam: " + sNumber.length);
        System.out.println("The highest score: " + largest());
        System.out.println("The worst score: " + smallest());
        System.out.print("The most frequent letter grade was: "); getMostFrequentGrade();
        System.out.println("The class average is " + (average/14));
        for (int i = 1; i <qcount.length ; i++) {
            System.out.println("The number of students that answered question " + i + " is: " + qcount[i]);
        }
        System.out.println("There were " + A + " Students who got an A");
        System.out.println("There were " + B + " Students who got an B");
        System.out.println("There were " + C + " Students who got an C");
        System.out.println("There were " + F + " Students who got an F");
        System.out.print("The best answered question was question number : ");System.out.print(bestanswered());
        System.out.print("The worst answered question was question number : ");System.out.print(worstanswered());
    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
        System.out.println();
        staistics();
    }
}
