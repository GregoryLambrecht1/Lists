package lists;

import java.util.Collection;
import java.util.HashSet;

public class PersonApp {
    public static void main(String[] args) {
        Collection <Person> personCollection = new HashSet<>();
        //making new persons
        Person person1 = new Person("greg", "lam","M",22,70,174);
        Person person2 = new Person("tom", "bam","F",44,67,150);
        Person person3 = new Person("bart", "nam","M",18,90,195);
        Person person4 = new Person("bart", "nam","M",18,90,195);

        //adding to collection
        personCollection.add(person1);
        personCollection.add(person2);
        personCollection.add(person3);
        personCollection.add(person4);

        //printing all the persons in the collection
        for (Person person : personCollection){
            System.out.println(person + " , ");
        }

    }
}
