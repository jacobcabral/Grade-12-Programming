public class Review03 {
    public static void main(String[] args) {
        //enhanced for
        char[] name = {'J', 'a','c', 'o', 'b'};

        for (char item: name) {
            System.out.println(item);
        }

        //bit switch
        boolean x = false;
        boolean y = false;
        boolean xXorY = x ^ y;
        System.out.println("false XOR false: "+xXorY); //false

        x = false;
        y = true;
        xXorY = x ^ y;
        System.out.println("false XOR true: "+xXorY); //true

        x = true;
        y = false;
        xXorY = x ^ y;
        System.out.println("true XOR false: "+xXorY); //true

        x = true;
        y = true;
        xXorY = x ^ y;
        System.out.println("true XOR true: "+xXorY); //false

        //case statement with strings
        String mark = "C";

        switch (mark){

            case "A" :
                System.out.println("You obtained an A");
                break;
            case "B" :
                System.out.println("You got a B");
                break;
            case "C" :
                System.out.println("You got a C");
                break;
            case "D" :
                System.out.println("You got a D");
                break;
            default:
                System.out.println("you did not enter a valid grade");
        }
        System.out.println("The results are: " + mark);

        //case statements with ints
        int test = 15;

        switch (test){
            case 15 :
                System.out.println("The number is fifteen");
                break;
            case 14 :
                System.out.println("The number is fourteen");
            case 13 :
                System.out.println("The number is thirteen");
            case 12 :
                System.out.println("the number is twelve");
            default:
                System.out.println("The number was improperly entered");
        }
        System.out.println(test);

        String[] lookforname = {"Jacob","Owen","Ethan","Aavin","Griffin", "Callum"};
        String suspect = "Aavin";
        boolean found = false;
        int i = 0;
        for (i = 0; i <lookforname.length ; i++) {
            if (lookforname[i] == suspect){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("The authorities have been notified, it's the " + i + " person in line");
        }
        else{
            System.out.println("Suspect not found");
        }

        String sName = "Jacob";
        String sOperator = (sName == "Jacob") ? "System operator recognised": "System user unknown";
        System.out.println(sName +", "+ sOperator);

        String sNamedemo = "Jack";
        String sOperatordemo = (sNamedemo == "Jacob") ? "System operator recognised": "System user unknown";
        System.out.println(sName +", "+ sOperator);




    }
}
