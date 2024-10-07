package com.pluralsight;


import com.pluralsight.model.Book;

public class Main {
    public static void main(String[] args) {

    }



    public static Book[] initializedLibrary() {

        Book[] library = new Book[30];

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

        // Adding 10 more books with Title first and ISBN second
        library[20] = new Book(21, "Becoming", "978-1400069286");
        library[21] = new Book(22, "Steve Jobs", "978-1451648539");
        library[22] = new Book(23, "Essentialism: The Disciplined Pursuit of Less", "978-0804139298");
        library[23] = new Book(24, "The Silent Patient", "978-0316497809");
        library[24] = new Book(25, "Educated", "978-1501171346");
        library[25] = new Book(26, "The Immortal Life of Henrietta Lacks", "978-0812993547");
        library[26] = new Book(27, "Where the Crawdads Sing", "978-1250217349");
        library[27] = new Book(28, "Me Before You", "978-0385349949");
        library[28] = new Book(29, "The Night Circus", "978-1476775715");
        library[29] = new Book(30, "The Girl on the Train", "978-1501110368");

        return library;
    }
}



//record Book (int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
//
//    public void checkOut(String name) {
//    }
//
//    public boolean StringIn() {
//
//    }
//}