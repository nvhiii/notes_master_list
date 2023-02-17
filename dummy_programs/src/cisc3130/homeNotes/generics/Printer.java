package cisc3130.homeNotes.generics;

public class Printer <T extends Animal1> { // generic printer class

    T printable; // class field

    public Printer(T newPrintable) {

        this.printable = newPrintable;

    }
    /* Above is the constructor with field as the type field
     *
     * Please keep in mind that the Type T does not exist at runtime,
     * it only exists during compile time!!
     *
     */

    // to make into bounded generic class, we can make T extend a class (e.g. T extends Animal)
    // If you want to use a Interface, not using implements in <>, must use extends
    // for multiple bounds, use & and list as many as you want, only 1 class which ALWAYS comes first

    public void Print() { // print method

        printable.eat();
        System.out.println(printable);

    }

}
