package com.pluralsight.model;

import java.util.Objects;

/**
 * The {@code Book} class represents a book in a library system.
 * It provides properties such as {@code id}, {@code isbn}, {@code title}, {@code isCheckedOut},
 * and {@code checkedOutTo}, along with methods for checking in and checking out books.
 */
public class Book {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    /*
     constructors, getters and setters
     */
    public Book() {
    }

    public Book(int id, String title, String isbn) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;

        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getId() == book.getId() && isCheckedOut() == book.isCheckedOut() && Objects.equals(getIsbn(), book.getIsbn()) && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getCheckedOutTo(), book.getCheckedOutTo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getIsbn(), getTitle(), isCheckedOut(), getCheckedOutTo());
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                '}';
    }


    /**
     * check out the book
     *
     * @param name set checkout person'name to the book object
     */
    public void checkOut(String name) {
        this.checkedOutTo = name;
        this.isCheckedOut = true;
    }

    /**
     * Checks the book back in, resetting its status.
     */
    public void checkIn() {
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }
}
