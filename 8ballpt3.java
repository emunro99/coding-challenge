import java.util.Scanner;
 
public class 8ballpt3 {
    public static void main (String[] args) {
         
        Scanner input = new Scanner(System.in);
         
        System.out.println("What is your question?");
        String name = input.nextLine();
                 
        String[] wordList = {"Yes",
        "Maybe",
        "No", 
        "As I see it, yes",
        "Ask again later",
        "Better not tell you now",
        "Cannot predict now",
        "Concentrate and ask again",
        "Don’t count on it",
        "It is certain",
        "It is decidedly so",
        "Most likely",
        "My reply is no",
        "My sources say no",
        "Outlook good",
        "Outlook not so good",
        "Reply hazy try again",
        "Signs point to yes",
        "Very doubtful",
        "Without a doubt",
        "Yes, definitely",
        "You may rely on it",
        "You have to be kidding",
        "You didn't seriously just ask that",
        "I think its better I don't answer that"};
        int oneLength = wordList.length;
        int rand1 = (int) (Math.random() * oneLength);
        String phrase = wordList[rand1];
        System.out.println ("The answer to your question is: " + phrase);
    }
}