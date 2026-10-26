package com.pruralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Book[] books = new Book[20];

        books[0] = new Book(123, "126483940", "The Great Gatsby");
        books[1] = new Book(124, "126483941", "To Kill a Mockingbird");
        books[2] = new Book(125, "126483942", "1984");
        books[3] = new Book(126, "126483943", "Pride and Prejudice");
        books[4] = new Book(127, "126483944", "The Catcher in the Rye");
        books[5] = new Book(128, "126483945", "The Hobbit");
        books[6] = new Book(129, "126483946", "Harry Potter");
        books[7] = new Book(130, "126483947", "The Alchemist");
        books[8] = new Book(131, "126483948", "Animal Farm");
        books[9] = new Book(132, "126483949", "The Lord of the Rings");
        books[10] = new Book(133, "126483950", "The Da Vinci Code");
        books[11] = new Book(134, "126483951", "The Hunger Games");
        books[12] = new Book(135, "126483952", "The Kite Runner");
        books[13] = new Book(136, "126483953", "The Book Thief");
        books[14] = new Book(137, "126483954", "Brave New World");
        books[15] = new Book(138, "126483955", "Dune");
        books[16] = new Book(139, "126483956", "The Shining");
        books[17] = new Book(140, "126483957", "Dracula");
        books[18] = new Book(141, "126483958", "Frankenstein");
        books[19] = new Book(142, "126483959", "The Silent Patient");

        books[0].checkOut("John");
        books[3].checkOut("Sarah");
        books[6].checkOut("Michael");
        books[9].checkOut("Emma");
        books[12].checkOut("David");




        int bookCounts = 20;

        while (true) {
            Scanner bookScanner = new Scanner(System.in);

            System.out.println("--- What do you want to do ---?");
            System.out.println("1 - Show Available Books ");
            System.out.println("2 - Show Checked Out Books  ");
            System.out.println("3 - Check In a Book");
            System.out.print("4 - Exit - closes out of the application ");

            int command = bookScanner.nextInt();

            switch (command) {
                case 1:
                    for (int i = 0; i < bookCounts; i++) {
                        System.out.println(books[i].getId() + " | " +
                                books[i].getIsbn() + " | " +
                                books[i].getTitle());
                    }
                    break;
                case 2: // ---- Show Available Books ---
                    for (Book book : books) {
                        if (book != null && !book.getIsCheckedOut()) {
                            System.out.println(book.getId() + " - " + book.getIsbn() + " - " + book.getTitle());
                        }
                    }
                    break;

                case 3:
                    for (int i = 3; i > 0; i--) {
                        System.out.println(i);
                        Thread.sleep(1000);

                    }
                    System.out.println("Existing");
                    return;
                case 4:
                    System.out.println("Enter the book your are returning");
                    int bookId = bookScanner.nextInt();

                    for (Book book: books){
                        if (book != null && book.getId() == bookId);
                        book.checkIn();
                        System.out.println("Book checked in successfully!");
                        break;


                    }

                }
            }

    }
}
