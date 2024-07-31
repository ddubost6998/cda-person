package com.example;

public class App {
    public static void main(String[] args) {
        Person person = new Person("damien", "dubost");

        String json = person.convertToJson(person);
        System.out.println("Personne en JSON : " + json);

        String capitalized = person.capitalizeString("coucou toi");
        System.out.println("Chaîne capitalisée : " + capitalized);
    }
}
