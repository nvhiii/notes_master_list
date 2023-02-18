package cisc3130.hw3;

public class FancyArray<E> { // generic fancy string array

    private int size;
    private E[] array; // String array (without creating arraylist, etc.

    public FancyArray() {

        this(10); // default constructor, where default capacity is 10

    }

    public FancyArray(int capacity) throws IllegalArgumentException {

        if (capacity < 0) {

            throw new IllegalArgumentException("");

        }

        array = (E[])new Object[capacity]; // initialize array using this + capacity

        this.size = 0; // since every obj is currently null, size is 0

    }

    public int size() { // getter method for size

        return size;

    }

    public void add(E element) {

        if (size == array.length) {
            throw new IllegalArgumentException("");
        }
        array[size++] = element;

    }

    public E get(int index) throws IndexOutOfBoundsException {

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException("");

        }

        return array[index]; // array[index] returns the element at specified index

    }

    public E set(int index, E newElement) throws IndexOutOfBoundsException {

        E temp = get(index);

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException("");

        }

        array[index] = newElement;

        return temp;

    }

    public <T> boolean contains(T s) {

        for (int i = 0; i < size; i++) {

            if (array[i].equals(s)) {

                return true;

            }

        }

        return false;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        if (size == 0) {

            return "[]";

        }

        sb.append("[");
        for (int i = 0; i < size; i++) {

            sb.append(array[i]);

            if (i < size - 1) {
                sb.append(", ");
            }

        }
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FancyArray)) {
            return false;
        }

        FancyArray<E> other = (FancyArray<E>) obj;

        if (size != other.size) {

            return false;

        }

        for (int i = 0; i < size; i++) {

            if (!array[i].equals(other.array[i])) {
                return false;
            }

        }
        return true;

    }

    public int indexOf(E e) {

        for (int i = 0; i < size; i++) { // parse through array until find a match

            if (array[i].equals(e)) {

                return i;

            }

        }

        return -1;

    }

    public int lastIndexOf(E e) {

        for (int i = size - 1; i >= 0; i--) { // reverse through the array

            if (array[i].equals(e)) {

                return i;

            }

        }

        return -1;

    }

    public void add(int index, E element) throws IllegalStateException, IndexOutOfBoundsException {

        if (size >= array.length) {

            throw new IllegalStateException(""); // caught exception if size exceeds capacity

        }

        if (index < 0 || index > size) {

            throw new IndexOutOfBoundsException(""); // caught exception if index is outlier

        }

        for (int i = size - 1; i >= index; i--) {

            array[i + 1] = array[i];

        }

        array[index] = element;
        size++;

    }

    public E remove(int index) throws IndexOutOfBoundsException {

        if (index < 0 || index >= size) {

            throw new IndexOutOfBoundsException("");

        }

        E element = array[index];
        for (int i = index; i < size - 1; i++) {

            array[i] = array[i+1];

        }
        array[size-1] = null; // sets value to nothing
        size--;
        return element;

    }

    public void addFrom(FancyArray<? extends E> other) {

        for (int i = 0; i < other.size; i++) {

            E element = (E) other.array[i];
            array[size] = element;
            size++;

        }

    }

    public void addTo(FancyArray<? super E> other) { // Consumer Super

        for (int i = 0; i < size; i++) {

            E element = (E) array[i];
            other.array[other.size] = element;
            other.size++;

        }

    }



}

