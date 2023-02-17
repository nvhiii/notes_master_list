package cisc3130.homeNotes.generics;

import java.util.ArrayList;
import java.util.List;

public class PrinterTest {

    public static void main(String[] args) {

        // Printer<Integer> newNum = new Printer<>(4);
        // utilizes T and turns it into type Integer

        Printer<Cat> mittens = new Printer<>(new Cat("moe"));

        // ^^ over here, we made T type into Cat, and therefore the Printer class knows since T extends animal, the input must be of type Cat

        shout("ooga");
        shout(new Cat("mittens").getName());

        shout2("John", "Doe");

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("mittens"));
        printList(catList);
    }

    private static <T> void shout(T thingToShout) { // to use T in type param, must specify return type <T>

        System.out.println(thingToShout + "!!!!!!!!");

    }

    private static <T, V> void shout2(T first, V last) {

        System.out.println(first + "!!!");
        System.out.println(last + "!!!");

    }

    // If you want a T return type in a method, specify it in method signature as the return type

    private static void printList(List<? extends Animal1> stuff) { // use wildcard ? not T when talking about list of anything, just dont know type at compile time

        System.out.println(stuff);

    }

}
