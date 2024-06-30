package com.persona;

import com.persona.models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person goofy = new Person("goofy", "disney", "12345678A", 1985,"USA",'H');
        Person miinie = new Person("miinie", "disney", "87654321A", 1984,"USA",'M');
       
        goofy.print();
        miinie.print();
    }
}
