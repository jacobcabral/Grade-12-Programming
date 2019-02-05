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



    }
}
