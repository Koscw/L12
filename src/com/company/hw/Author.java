package com.company.hw;

public class Author {
    String name;
    String surname;
    String books;

    public Author(String name, String surname, String books) {
        this.name = name;
        this.surname = surname;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", books='" + books + '\'' +
                '}';
    }
}
