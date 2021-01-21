package main.builder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
         User user = new User.Builder("Ahmed", "Ali").build();

         User user2 = new User.Builder("Ali", "Shehab")
                 .age(22)
                 .address("who knows")
                 .phone("0100000001000")
                 .build();

         User user3 = new User.Builder("Mohamed", "Ahmed")
                 .age(30).build();

         System.out.println(
                 "User: " + user.hashCode() + " "+ user.toString()
         );

        System.out.println(
                "User: " + user2.hashCode() + " "+ user2.toString()
        );

        System.out.println(
                "User: " + user3.hashCode() + " "+ user3.toString()
        );
    }
}