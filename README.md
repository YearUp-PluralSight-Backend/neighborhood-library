Certainly! Here’s a documentation template for your Java library system code, including descriptions for the `Main`, `Console`, and `Book` classes, along with their methods.

---

# Library System Documentation

## Overview

This library system allows users to check in and check out books, view available and unavailable books, and manage a collection of books. The system is designed with a user-friendly console interface.

## Classes

### 1. `Main`

The `Main` class is the entry point for the library system. It initializes the library, displays books, and manages user interactions.

#### Properties
- `Book[] library`: An array to store all books in the library.
- `Book[] availableBooksList`: An array to store available books.
- `Book[] unAvailableBooksList`: An array to store unavailable books.
- `List<String> exitOptions`: A list of options for exiting the program.
- `final static String CHECKOUT`: Constant string for checking out books.
- `final static String CHECKIN`: Constant string for checking in books.

#### Methods
- `public static void main(String[] args)`: The main method that runs the application.
- `private static void homeScreen()`: Prompts users with a multi-choice menu and directs them based on their selections.
- `private static void checkInOrOut(String option)`: Allows users to check in or check out a book based on their choice.
- `private static void printMenu(String header, String... options)`: Prints the menu for the library system.
- `private static Book[] unAvailableBooks(Book[] library)`: Returns an array of books that are currently unavailable.
- `private static Book[] availableBooks(Book[] books)`: Returns an array of books that are currently available.
- `public static void displayBooks(Book[] books)`: Displays the current status of the books in the library.
- `private static Book[] getInitializedLibrary()`: Initializes the library with a set of predefined books.

---

### 2. `Console`

The `Console` class provides utility methods for prompting user input through the console.

#### Methods
- `public static String promptForString()`: Prompts the user for a string input and returns the value.
- `public static String promptForString(String prompt)`: Prompts the user with a specified message and returns the input string.
- `public static boolean promptForYesNo(String prompt)`: Prompts the user with a yes/no question and returns a boolean value indicating their response.
- `public static short promptForShort(String prompt)`: Prompts the user for a short integer input and returns the value.
- `public static byte promptForByte(String prompt)`: Prompts the user for a byte input and returns the value.

---

### 3. `Book`

The `Book` class represents a book within the library system, encapsulating its properties and behaviors.

#### Properties
- `private int id`: The unique identifier for the book.
- `private String isbn`: The ISBN of the book.
- `private String title`: The title of the book.
- `private boolean isCheckedOut`: Indicates if the book is checked out.
- `private String checkedOutTo`: The name of the person who has checked out the book.

#### Constructors
- `public Book()`: Default constructor.
- `public Book(int id, String title, String isbn)`: Initializes a book with an ID, title, and ISBN, setting `isCheckedOut` to `false` and `checkedOutTo` to an empty string.

#### Methods
- `public int getId()`: Returns the ID of the book.
- `public void setId(int id)`: Sets the ID of the book.
- `public String getIsbn()`: Returns the ISBN of the book.
- `public void setIsbn(String isbn)`: Sets the ISBN of the book.
- `public String getTitle()`: Returns the title of the book.
- `public void setTitle(String title)`: Sets the title of the book.
- `public boolean isCheckedOut()`: Returns whether the book is checked out.
- `public void setCheckedOut(boolean checkedOut)`: Sets the checked-out status of the book.
- `public String getCheckedOutTo()`: Returns the name of the person who has checked out the book.
- `public void setCheckedOutTo(String checkedOutTo)`: Sets the name of the person who has checked out the book.
- `public void checkOut(String name)`: Checks out the book to a person with the specified name.
- `public void checkIn()`: Resets the book's status to indicate it is available.
- `@Override public boolean equals(Object o)`: Compares this book with another object for equality.
- `@Override public int hashCode()`: Returns the hash code of the book.
- `@Override public String toString()`: Returns a string representation of the book.

---

## Usage

To run the library system, execute the `main` method in the `Main` class. Users will be prompted to view available books, checked-out books, or exit the program. The system allows for interactive check-in and check-out of books through a simple console interface.

---
