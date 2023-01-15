package exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class aliceInWonderland {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having" +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or" +
                "conversation?";
        System.out.println(paragraph);
        System.out.println("What word would you like to search for?: ");
        String searchWord = input.nextLine().toLowerCase();
        Boolean wordFound = paragraph.contains(searchWord);
        if (wordFound) {
            System.out.println("Your word is in the paragraph");
        } else {
            System.out.println("word was not found");
        }




    }
}
