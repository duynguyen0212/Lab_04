package Lab04A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String args[]){

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("John", 20));
        people.add(new Person("David", 25));
        people.add(new Person("Joe", 48));
        people.add(new Person("Sebastian", 25));
        people.add(new Person("Christopher", 18));

        System.out.println("\nArray list before sorting:");
        for( Person str : people)
            System.out.println(str.name + " " + str.age + " years old");

        System.out.println("\nSorting by age:");
        Collections.sort(people, new AgeComparator());
        Iterator itr = people.iterator();
        while(itr.hasNext()){
            Person ppl = (Person)itr.next();
            System.out.println(ppl.name + " " + ppl.age + " years old");
        }

        System.out.println("\nSorting by name:");
        Collections.sort(people, new LexicographicComparator());
        Iterator itr1 = people.iterator();
        while(itr1.hasNext()){
            Person ppl = (Person)itr1.next();
            System.out.println(ppl.name + " " + ppl.age + " years old");
        }
    }

}
