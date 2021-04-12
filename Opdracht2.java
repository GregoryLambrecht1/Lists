package lists;

import java.util.*;


public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Collection <Integer> lottoList = new HashSet<>();

        //asking for new numbers if u dont got 6 numbers yet
        int counter = 0;
        while(counter < 6) {

            System.out.println("give a number between 1-45");
            lottoList.add(scanner.nextInt());
            counter++;
        }
        //printing your numbers
        System.out.println("your numbers are : ");

        for (int i : lottoList){
            System.out.print(i + " , ");
        }

        System.out.println("");

        //making new list for the house numbers
        Collection <Integer> lottoListHouse = new HashSet<>();
        int counterHouse = 0 ;
        while(counterHouse < 6){
            lottoListHouse.add(random.nextInt(45)+1);
            counterHouse++;
        }
        System.out.println("the numbers of the house are : ");
        for (int i : lottoListHouse){
           System.out.print(i + " , ");
        }

       //using retainAll to check if there are winning numbers
       lottoList.retainAll(lottoListHouse);

        System.out.println("");
        System.out.println("winning number is : ");
        for (int i : lottoList){
           System.out.print(i + " , ");
       }

    }
}
