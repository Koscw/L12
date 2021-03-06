package com.company.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Manager {
    static BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
    private static final ArrayList<Book> books = new ArrayList<>();
    private static final ArrayList<Genre> genres = new ArrayList<>();
    private static final ArrayList<Author> authors = new ArrayList<>();


    static void addBook() throws IOException {
        System.out.println("Print  books name");
        String name = bR.readLine();

        System.out.println("Choose books author");
        getAuthors();
        System.out.println("Print author number (0 or 1 etc.)");
        int author = Integer.parseInt(bR.readLine());
        Author author1 = authors.get(author);

        System.out.println(" Add description");
        String description = bR.readLine();

        System.out.println("Add books year");
        int year = 0;
        try {
            year = Integer.parseInt(bR.readLine());
        } catch (IOException e) {
            System.out.println("Print books year in numbers (like 123)");
        }
        System.out.println("Add books genre");
        getGenres();
        System.out.println("Print genre number (0 or 1 etc.)");
        int genre;
        try {
            genre = Integer.parseInt(bR.readLine());
        } catch (IOException e) {
            System.out.println("Try again");
            System.out.println("Print author number (0 or 1 etc.)");
            genre = Integer.parseInt(bR.readLine());
        }

        Genre genre1 = genres.get(genre);

        Book book = new Book(name, author1, description, year, genre1);
        books.add(book);
    }

    static void addGenre() throws IOException {
        System.out.println("Print genre name");
        String name = bR.readLine();

        System.out.println("Print genre description");
        String description = bR.readLine();

        Genre genre = new Genre(name, description);
        genres.add(genre);
    }

    static void addAuthor() throws IOException {
        System.out.println("Print authors name");
        String name = bR.readLine();

        System.out.println("Print authors surname");
        String surname = bR.readLine();

        System.out.println("Print authors books");
        String books = bR.readLine();

        Author author = new Author(name, surname, books);

        authors.add(author);
    }

    static void deleteBook() throws IOException {
        System.out.println("All books you've got:");
        getBooks();
        System.out.println("Add books name");
        String name = bR.readLine();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().contains(name)){
                books.remove(i);
            }
        }
    }

    static void deleteGenre() throws IOException {
        System.out.println("All genres you've got:");
        getGenres();
        System.out.println("Add genres name");
        String name = bR.readLine();
        for (int i = 0; i < genres.size(); i++) {
            if (genres.get(i).getName().contains(name)){
                genres.remove(i);
            }
        }
    }

    static void deleteAuthor() throws IOException {
        System.out.println("All authors you've got:");
        getAuthors();
        System.out.println("Add authors name");
        String name = bR.readLine();
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).getName().contains(name)){
                authors.remove(i);
            }
        }
    }

    static void getBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Number " + i + ": " + books.get(i));

        }
    }

    static void getGenres() {
        for (int i = 0; i < genres.size(); i++) {
            System.out.println("Number " + i + ": " + genres.get(i));

        }
    }

    static void getAuthors() {
        for (int i = 0; i < authors.size(); i++) {
            System.out.println("Number " + i + ": " + authors.get(i));

        }
    }
}
