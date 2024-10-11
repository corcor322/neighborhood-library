package com.pluralsight;

public class Library {
    public static void main(String[] args) {

        //create book array
        Book[] books = new Book[20];
        //fill with +five books
        books[0] = new Book("The Great Gatsby",  1753488, "1982146702", false);
        books[1] = new Book("Les Miserables",  898776, "0449300021", false);
        books[2] = new Book("The Count of Monte Cristo",  23456760, "0486456439", false);
        books[3] = new Book("Ash",  7647899, "0316531316", false);
        books[4] = new Book("The God Box", 78908655, "1416909001", false);


        //checkOut method to switch isCheckedOut from false to true

        //checkIn method to switch isCheckedOut from true to false

        //build home screen
    }
}
