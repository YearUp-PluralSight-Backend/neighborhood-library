package com.pluralsight;


import com.pluralsight.model.Book;
import com.pluralsight.util.Console;

import java.util.Arrays;
import java.util.List;

/**
 * The {@code Main} represents an entry for the library system
 * It provides properties such as {@code library}, {@code availableBooksList}, {@code unAvailableBooksList}, {@code exitOptions}
 * It has method: {@code homeScreen} {@code checkInOrOut} {@code printMenu} {@code unAvailableBooks} {@code availableBooks} {@code displayBooks} {@code getInitializedLibrary}
 * <p>
 * * This class includes:
 * <ul>
 *     <li></li>
 * </ul>
 * </p>
 */
public class Main {


    static Book[] library;      /* An array to store the books */
    static Book[] availableBooksList;     /* An array to store the available books */
    static Book[] unAvailableBooksList;     /* An array to store the  unavailable books */
    static List<String> exitOptions = List.of("Q", "X", "EXIT", "QUIT");     /* a list of option for exit the program */
    final static String CHECKOUT = "checkout";
    final static String CHECKIN = "checkin";


    /**
     * run the application without arguments
     *
     * @param args
     */
    public static void main(String[] args) {
        library = getInitializedLibrary();
        displayBooks(library);
        homeScreen();

    }

    /**
     * prompt a multi-choices for users
     * based on their choices, guide them to different methods:
     *
     * @return char
     */

    private static void homeScreen() {

        String command = "";
        do {
            try {
                printMenu("Welcome to USA Library", "Show [A]vailable Books", "Show [C]hecked Out Books", "E[X]it the Library");
                System.out.print("-".repeat(50) + "Command [A, C, X]: ");
                command = Console.promptForString().toUpperCase();

                switch (command) {
                    case "A":
                        availableBooksList = availableBooks(library);
                        displayBooks(availableBooksList);
                        boolean checkOut = Console.promptForYesNo("Would you like to checkout? ");
                        if (checkOut) {
                            checkInOrOut(CHECKOUT);
                        }
                        break;
                    case "C":
                        unAvailableBooksList = unAvailableBooks(library);
                        displayBooks(unAvailableBooksList);
                        boolean checkIn = Console.promptForYesNo("Would you like to checkin? ");
                        if (checkIn) {
                            checkInOrOut(CHECKIN);
                        }
                        break;
                    case "I":
                        break;
                    case "X":
                    case "Q":
                    case "EXIT":
                    case "QUIT":
                        return;
                    default:
                        System.out.println("Out of the options. Only [A, C, X]");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (!exitOptions.contains(command));


    }

    /**
     * based on their option to either check in or check out the book
     *
     * @param option
     */
    private static void checkInOrOut(String option) {
        try {
            String name = Console.promptForString("Please enter your name: ");
            int bookId = Console.promptForShort("Please enter book id: ");

            if (option.equalsIgnoreCase(CHECKOUT)) {
                for (Book book : library) {

                    if (book.getId() == bookId) {
                        book.checkOut(name);
                        System.out.println(name + "checkout the" + book.getTitle());
                        break;
                    }
                }
            } else if (option.equalsIgnoreCase(CHECKIN)) {

                for (Book book : library) {

                    if (book.getId() == bookId) {
                        book.checkIn();
                        System.out.println(name + "checkout the" + book.getTitle());
                        break;
                    }
                }
            } else {
                System.out.println("Out of Option!");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * print out the menu of the Library
     *
     * @param header
     * @param options
     */
    private static void printMenu(String header, String... options) {
        System.out.println("-".repeat(50) + header + "-".repeat(55));
        for (String option : options) {
            System.out.println("-".repeat(50) + option + "-".repeat(55));
        }
    }

    /**
     * @param library
     * @return books that are unavailable.
     */
    private static Book[] unAvailableBooks(Book[] library) {


        int newUnavaliableBooksLength = Arrays.stream(library).filter(book -> book.isCheckedOut()).toArray().length;
        Book[] unAvailableBooks = new Book[newUnavaliableBooksLength];

        for (int i = 0; i < library.length; i++) {
            if (library[i].isCheckedOut()) {
                unAvailableBooks[i] = library[i];
            }
        }

        return unAvailableBooks;
    }

    /**
     * accept one list of books as argument
     * filtering them based on their conditions, if it is not checked out, save to the availableBooks.
     *
     * @param books
     * @return Book[]
     */
    private static Book[] availableBooks(Book[] books) {

        Book[] availableBooks = Arrays.stream(books).filter(book -> !book.isCheckedOut()).toArray(Book[]::new);
        return availableBooks;
    }

    /**
     * display the current books' status
     *
     * @param books
     */
    public static void displayBooks(Book[] books) {

        String space = " ";
        System.out.println(space.repeat(3) + "ID |" + space.repeat(30) + "Title" + space.repeat(37) + "|" + space.repeat(11) + "ISBN " + space.repeat(11) + "|" + space.repeat(5) + "Check Out To" + space.repeat(5) + "|");
        System.out.println("-".repeat(130));
        for (Book book : books) {

            System.out.printf("%5s | %70s | %25s | %20s \n".formatted(book.getId(), book.getTitle(), book.getIsbn(), book.getCheckedOutTo()));
        }
    }

    /**
     * initializing the books
     *
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

        library[0].setCheckedOut(true);
        library[0].setCheckedOutTo("Harry");

        library[1].setCheckedOut(true);
        library[1].setCheckedOutTo("Harry");
        return library;
    }
}

