# Code Review

---

## Overall

- [ ] in your github repo, the structure of the project is not correct, you have only put java files directly in your
  repo.

---

## Opdracht 01:

    System.out.println("give a number");
    int numb1 = scanner.nextInt();
    numberList.add(numb1);
    
    System.out.println("give a number");
    int numb2 = scanner.nextInt();
    numberList.add(numb2);
    
    System.out.println("give a number");
    int numb3 = scanner.nextInt();
    numberList.add(numb3);

**TODO**

- [ ] sum : 50 average : 16 which is not fully ideal solution. You could've used here double for getting a more precise
  average.

  give a number 10 give a number 25 give a number 15 10 25 15 sum : 50 average : 16

- [ ] make the output as below:

      | Number index 1.................. | 10.00 | 
      | Number index 2.................. | 25.00 | 
      | Number index 3.................. | 15.00 | 
      | Sum of all numbers.............. | 50.00 | 
      | The average of all numbers ..... | 16.66 |

- [ ] Change the list type to LinkedList and observe applications reaction. <br/>
- [ ] Opdracht1_2.java asking input word by word. It would be better you retrieve the whole sentence and then split, add
  every word to the list. then you'd do whatever you'd like to with the words. such as reversing the order etc. when I
  entered the sentence as input, that's what I've received this kind of output:

      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      for the sweet love rememberd such wealth brings, then I scorn to change my state with kings.. W.Sheakespeare. 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      give a word to make a sentence, give a word that ends with '.' to end the sentence 
      sentence complete 
      
      kings.. with state my change to scorn I then brings, wealth such rememberd love sweet the for 
      17 

- [ ]  My question to you is: How readable this output for a user? What is 17 at the end? <br/>
  You perhaps think that these tasks just needed to be done and how it presented was not so essential. <br/>

---

## Opdracht 02:

    Collection<Integer> lottoListHouse = new HashSet<>();
    int counterHouse = 0;
    while (counterHouse < 6) {
    lottoListHouse.add(random.nextInt(45) + 1);
    counterHouse++;

**TODO:**

- [ ] What happens if I give invalid number as an input? You have created a counter where users can enter their inputs
  max 6 times. What if one, or two of those numbers were invalid? I tried this as an ex:

      give a number between 1-45 
      1 
      give a number between 1-45 
      2 
      give a number between 1-45 
      3 
      give a number between 1-45 
      6 
      give a number between 1-45 
      9 
      give a number between 1-45 
      55 
      your numbers are : 
      1 , 2 , 3 , 6 , 55 , 9 , 
      the numbers of the house are : 
      33 , 5 , 24 , 10 , 11 , 30 , 
      winning number is :  

- [ ] Could you refactor instructions below with ONLY one for loop? What's more, please stop using while loop for
  indexed loops, which makes the code difficult to read.

      Collection<Integer> lottoListHouse = new HashSet<>();
      int counterHouse = 0;
      while (counterHouse < 6) {
        lottoListHouse.add(random.nextInt(45) + 1);
        counterHouse++;
      }
      System.out.println("the numbers of the house are : ");
      for (int i : lottoListHouse) {
        System.out.print(i + " , ");
      }

---

## PersonApp

- [ ] Read about the Collection class from JDK documentation. Which class or interface would fit better here rather than
  Collection?

      Collection<Person> personCollection = new HashSet<>();

---

## Opdracht 03

**TODO**

- [ ] do the same fixes & refactorings for the lottery app that you ought to do in 'Opdract 02'
- [X] based on the code block below:

      System.out.println("");
      System.out.println("winnende number is : ");
      for (int i : lottoList) {
        System.out.print(i + " , ");
      }

- [ ] change every string to English.
- [ ] int i does not emphasize anything about the responsibility of the variable, try to use better naming for the
  variable.
- [ ] since the output has no difference than 'Opdracht 02', try to add extra print message explaining what the
  differences are. for ex: you can print indexes of lottery numbers.

---

## Opdracht 04

**TODO**

- [ ] translate the content of messages to English.

      for (int i = 0; i < 4; i++) {
        System.out.println("geef een woord");
        wordlist.add(scanner.next());
      }

- [ ] the same issue with 'Opdracht 02'. Ddd some validation code to make sure the user will enter valid inputs. tip:
  for loop should not be limited to 4, but the loop must be broken when there are 4 valid inputs.

- [ ] String i is not a part of clean code :) Make it look awesome !!

      for (String i : wordlist) {
            System.out.println(i);
      }

---
<div style="text-align: center; font-size: large">
Thank you in advance for patiently reading and applying my recommendations.. 
<br/><br/> MAY THE CODE BE WITH YOU !!
</div>