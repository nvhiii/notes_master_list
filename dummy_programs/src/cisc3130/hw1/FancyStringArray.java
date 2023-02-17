package cisc3130.hw1;

public class FancyStringArray {

    private int cap;
    private int size;
    private final String[] fancyString;

    public FancyStringArray() {

        fancyString = new String[10];

    }

    public FancyStringArray(int capacity) throws IllegalArgumentException { // capacity is the max

        if (capacity < 0) {
            throw new IllegalArgumentException("");
        }

        this.cap = capacity;

        this.fancyString = new String[this.cap];


    }

    public static int size(String[] array) { // this lists how many elements are currently non-null values

        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != null)
                counter++;

        }

        return counter;


    }

/*

    public void add(String element) throws IllegalStateException { // adds element in array at the next available index

        if (this.cap == this.size) {

            throw new IllegalStateException("");

        } else {



        }

        // add methodology here

    }


 */


    public String get(int index) throws IndexOutOfBoundsException { // returns element at index

        if (index < 0 || index >= this.size) {

            throw new IndexOutOfBoundsException("");

        }

        return fancyString[index];

    }

    public String set(int index, String newElement) { // replacces old element at index w/ new element, and returns old element

        if (index < 0 || index >= this.size) {

            throw new IndexOutOfBoundsException("");

        }

        String initValue = fancyString[index];

        fancyString[index] = newElement;

        return initValue;

    }
/*
    public boolean contains(String s) { // checks whether FancyStringArray contains s

        for (s : fancyString) {

            if ()


        }

    }

 */

    @Override
    public String toString() { // does a string representation of array

        return "["; // edit this

    }



    @Override
    public boolean equals(Object o) { // equality

        if (o instanceof FancyStringArray) {

            FancyStringArray other = (FancyStringArray) o;

            return (this.size == other.size) && (this.toString().equals(other.toString()));

        } else {

            return false;

        }


    }





}
