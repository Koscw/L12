package com.company;

import java.util.List;

public class Pearson {
    private final String name;
    private final List<String> emails;

    public Pearson(String name, List<String> emails) {
        this.name = name;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return emails;
    }
    public static List<Pearson> getPeople() {
        Pearson pearson1 = new Pearson("John",
                List.of("john1@gmail.com","john2@gmail.com","john3@gmail.com"));
        Pearson pearson2 = new Pearson("Margaret",
                List.of("margaret1@gmail.com","margaret2@gmail.com","margaret3@gmail.com"));
        Pearson pearson3 = new Pearson("Kate",
                List.of("kate1@gmail.com","kate2@gmail.com","kate3@gmail.com"));
        List<Pearson> people = List.of(pearson1,pearson2,pearson3);
        return people;
    }
}
