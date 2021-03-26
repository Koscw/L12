package com.company.hw;

public class Book {
    private final String name;
    private final Author author;
    private final String description;
    private final int yearOfPublish;
    private final Genre genre;

    public Book(String name, Author author, String description, int yearOfPublish, Genre genre) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.yearOfPublish = yearOfPublish;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", description='" + description + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", genre=" + genre +
                '}';
    }
}
