package packageb;

import packagea.ClassA; // intelliJ doesnt allow to add import before referring to other package class first unfortunately

public class ClassB {

    public static void main(String[] args) {

        ClassA item; // also could do ClassA item = new ClassA(); for instantiation purposes
        System.out.println("Got it");

    }

}
