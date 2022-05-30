package myapp.core;

import java.io.Console;

public class Greetings {
    //write entry point
    public static void main(String[] args) {
        //Get the console
        Console cons = System.console();
       
        // read from input
        String name = cons.readLine("what is your name?");
        // if statement
        if (name.length() > 0 ){
            System.out.printf("Hello %s\n" , name.toUpperCase());
        } else {
            System.err.println("you have not told me your name");
        }

    }
}

