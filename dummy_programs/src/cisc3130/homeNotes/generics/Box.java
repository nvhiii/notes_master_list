package cisc3130.homeNotes.generics;

public class Box<T> {

    private T t; // t = referenceVar for field, T = type

    public void set(T newT) { // T = param type, t = referenceVar

        this.t = newT;

    }

    public T get() {

        return t;

    }

}

// above is a typical generic class

/*
 * Most common type param names:
 *
 *  E - Element
 *  K - Key
 *  N - Number
 *  T - Type
 *  V - Value
 *  S, U, V etc. - 2nd, 3rd, 4th types
 *
 */