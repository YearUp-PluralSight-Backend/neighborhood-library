package com.pluralsight;


import com.pluralsight.model.Book;
import com.pluralsight.util.Console;

import java.util.Scanner;

public class Main {

    static Book[] library;

    public static void main(String[] args) {
    library = getInitializedLibrary();


    displayBooks(library);

    }

    private static char promptMainChoices() {
        System.out.println("-".repeat(20) + "Welcome to USA Library" + "-".repeat(20));
        System.out.println("    Show [A]vailable Books");
        System.out.println("    Show [C]hecked Out Books");
        System.out.println("    E[X]it the Library");

        do{

            System.out.print("Command [A, C, X]: ");
            String command = Console.promptForString();

            if ( command.equalsIgnoreCase("A")){
                return 'A';
            }
            if (command.equalsIgnoreCase("C")){
                return 'C';
            }
            if (command.equalsIgnoreCase("X")
                    || command.equalsIgnoreCase("EXIT")
                    || command.equalsIgnoreCase("Q")
                    || command.equalsIgnoreCase("QUIT")
            ){
                return 'X';
            }
        }  while (true);


    }

    /**
     *  display the current books' status
     * @param books
     */
    public static void displayBooks(Book[] books) {

        String space = " ";
        System.out.println(space.repeat(3) + "ID |" + space.repeat(30) + "Title" + space.repeat(37) + "|" + space.repeat(11)  + "ISBN " + space.repeat(11) + "|" + space.repeat(5) + "Check Out To" + space.repeat(5) + "|");
        System.out.println("-".repeat(130));
        for (Book book: books) {

            System.out.printf("%5s | %70s | %25s | %25s \n".formatted(book.getId(), book.getTitle(), book.getIsbn(), book.getCheckedOutTo()));
        }
    }
    /**
     *
     * initializing the books
     * @return Book[]
     */
    private static Book[] getInitializedLibrary() {

        Book[] library = new Book[20];

        // First 20 books, with Title first and ISBN second
        library[0] = new Book(1, "Mindset: The New Psychology of Success", "978-0345472328");
        library[1] = new Book(2, "Sapiens: A Brief History of Humankind", "978-0062316097");
        library[2] = new Book(3, "The Power of Habit: Why We Do What We Do", "978-0553380163");
        library[3] = new Book(4, "Grit: The Power of Passion and Perseverance", "978-0143127741");
        library[4] = new Book(5, "To Kill a Mockingbird", "978-0061122415");
        library[5] = new Book(6, "The Lean Startup: How Today's Entrepreneurs Use Innovation", "978-0307465351");
        library[6] = new Book(7, "Start with Why: How Great Leaders Inspire Everyone", "978-1455586691");
        library[7] = new Book(8, "Drive: The Surprising Truth About What Motivates Us", "978-0307592736");
        library[8] = new Book(9, "The Alchemist", "978-1476708706");
        library[9] = new Book(10, "Looking for Alaska", "978-0142424179");
        library[10] = new Book(11, "Outliers: The Story of Success", "978-0307947739");
        library[11] = new Book(12, "The Subtle Art of Not Giving a F*ck", "978-0062315007");
        library[12] = new Book(13, "You Are a Badass", "978-1501139154");
        library[13] = new Book(14, "Born a Crime", "978-0812981605");
        library[14] = new Book(15, "Thinking, Fast and Slow", "978-1451666175");
        library[15] = new Book(16, "The Road", "978-0307387899");
        library[16] = new Book(17, "The Four Agreements", "978-0451499080");
        library[17] = new Book(18, "The Untethered Soul", "978-1501161933");
        library[18] = new Book(19, "The Gifts of Imperfection", "978-0307455925");
        library[19] = new Book(20, "Eclipse", "978-0316029186");
        return library;
    }
}
