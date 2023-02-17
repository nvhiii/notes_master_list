package cisc3130.homeNotes.generics;

public class Cat extends Animal1 {

    public Cat (String name) {

        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public void speak() {

        System.out.println("meow");

    }

}
