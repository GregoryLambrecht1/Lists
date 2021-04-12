package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //make new list
        List <Integer> numberList = new LinkedList<>();

        //let user give a couple numbers
        System.out.println("give a number");
        int numb1 = scanner.nextInt();
        //add the number to array
        numberList.add(numb1);

        System.out.println("give a number");
        int numb2 = scanner.nextInt();
        numberList.add(numb2);

        System.out.println("give a number");
        int numb3 = scanner.nextInt();
        numberList.add(numb3);

        //printing the whole list
        for (int i = 0 ; i < numberList.size();i++){
            System.out.println(numberList.get(i));
        }

        //sum and average
        int sum = 0;
        for (int i = 0 ; i < numberList.size();i++){
            sum = sum + numberList.get(i);
        }
        int average = sum / numberList.size();

        System.out.println("sum : " + sum);
        System.out.println("average : " + average);

        //
    }
}
