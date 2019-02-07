public class Review03 {
    public static void main(String[] args) {
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


    }
}
