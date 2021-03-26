package com.company.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Target;
import java.util.Locale;

import static com.company.hw.Manager.*;

public class LibraryMain {
    static BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Print enter to start");
        while (bR.readLine().equals("")) {
            working();
        }
    }
    private static void working() throws IOException {
        System.out.println("Enter book/author/genre");
        Type input = Type.valueOf(bR.readLine().toUpperCase(Locale.ROOT));
        switch (input) {
            case BOOK : {
                System.out.println("Enter add/delete/get");
                OperationType op1 = OperationType.valueOf(bR.readLine().toUpperCase(Locale.ROOT));
                if (op1.equals(OperationType.ADD)) {
                    addBook();
                } else if (op1.equals(OperationType.DELETE)) {
                    deleteBook();
                } else if (op1.equals(OperationType.GET)) {
                    getBooks();
                }else {
                    System.out.println("Haven't got such function");
                }
            }
            case AUTHOR : {
                System.out.println("Enter add/delete/get");
                OperationType op1 = OperationType.valueOf(bR.readLine().toUpperCase(Locale.ROOT));
                if (op1.equals(OperationType.ADD)) {
                    addAuthor();
                } else if (op1.equals(OperationType.DELETE)) {
                    deleteAuthor();
                } else if (op1.equals(OperationType.GET)) {
                    getAuthors();
                }else {
                    System.out.println("Haven't got such function");
                }
            }
            case GENRE : {
                System.out.println("Enter add/delete/get");
                OperationType op1 = OperationType.valueOf(bR.readLine().toUpperCase(Locale.ROOT));
                if (op1.equals(OperationType.ADD)) {
                    addGenre();
                } else if (op1.equals(OperationType.DELETE)) {
                    deleteGenre();
                } else if (op1.equals(OperationType.GET)) {
                    getGenres();
                }else {
                    System.out.println("Haven't got such function");
                }
            }
            default : System.out.println("Error,try again latter");

        }
    }
}
