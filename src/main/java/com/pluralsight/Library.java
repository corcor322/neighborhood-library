package com.pluralsight;

public class Library {
    public static void main(String[] args) {

        //create book array
        Book[] books = new Book[5];
        //fill with +five books
        books[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", "PS3511.I9 G7 1991", 1982146702, false);
        books[1] = new Book("Les Miserables", "Victor Hugo", "PZ7.K9490155 Le 1995", 449300021, false);
        books[2] = new Book("The Count of Monte Cristo", "Alexandre Dumas", "PZ3.D89 Cou11", 486456439, false);
        books[3] = new Book("Ash", "Malinda Lo", "PZ8.L773 Ash 2019", 316531316, false);
        books[4] = new Book("The God Box", "Alex Sanchez", "PZ7.S19475 God 2007", 1416909001, false);


        //checkOut method to switch isCheckedOut from false to true

        //checkIn method to switch isCheckedOut from true to false

        //build home screen
    }
}
