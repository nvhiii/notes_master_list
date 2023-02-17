package cisc3130.homeNotes.generics;

public class Printer <T extends Animal1> { // generic printer class && bounded generic

    // to implement an interface, do <T extends Animal & Serializable>, 1 class comes first, and interface after

    T printable; // class field
    // V printable2; If you want another Generic field, must specifiy in method signature e.g. <T, V>

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

    public void print() { // print method

        printable.eat();
        System.out.println(printable);

    }

}
