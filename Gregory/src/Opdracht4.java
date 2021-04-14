import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Opdracht4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NavigableSet<String> wordlist = new TreeSet<>();

        //letting user choose 4 words
        for (int i = 0; i < 4; i++) {
            System.out.println("geef een woord");
            wordlist.add(scanner.next());
        }

        System.out.println("");

        //printing the whole list
        for (String i : wordlist) {
            System.out.println(i);
        }

        //printing first and last word in alphabetical order
        System.out.println("first word " + wordlist.first());
        System.out.println("last word " + wordlist.last());

    }
}
