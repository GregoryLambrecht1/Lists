import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opdracht1_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> sentence = new ArrayList<>();

        //let the user add a word , if the word ends with an "." , make the program stop asking more words
        boolean giveAnotherWord = true;
        while (giveAnotherWord) {
            System.out.println("give a word to make a sentence, give a word that ends with '.' to end the sentence");
            final var input = scanner.next();
            sentence.add(input);
            //checking if the word ends with a "."
            if (input.endsWith(".")) {
                System.out.println("sentence complete");
                giveAnotherWord = false;
            }
        }
        //print reverse order of the list
        System.out.println();
        for (int i = sentence.size() - 1; i >= 0; i--) {
            System.out.print(sentence.get(i) + " ");
        }
        //count how many words are in list
        System.out.println();
        System.out.println(sentence.size());

    }
}

