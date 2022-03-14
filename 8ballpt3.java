import java.util.Scanner;
 
public class Magic8Ball {
    public static void main (String[] args) {
         
        Scanner input = new Scanner(System.in);
         
        System.out.println("What is your question?");
        String name = input.nextLine();
                 
        String[] wordList = {"Yes","Maybe","No"};
        int oneLength = wordList.length;
        int rand1 = (int) (Math.random() * oneLength);
        String phrase = wordList[rand1];
        System.out.println ("The answer to your question is: " + phrase);
    }
}