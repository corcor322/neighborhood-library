package com.pluralsight;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?:");
        System.out.println("1. Show Available Books");
        System.out.println("2. Show Checked Out Books");
        System.out.println("3. Exit Program");

        int input = scanner.nextInt(); //build home screen

        //create book array
        Book[] books = new Book[20];
        //fill with +five books
        books[0] = new Book("The Great Gatsby",  1753488, "1982146702", false);
        books[1] = new Book("Les Miserables",  898776, "0449300021", false);
        books[2] = new Book("The Count of Monte Cristo",  23456760, "0486456439", false);
        books[3] = new Book("Ash",  7647899, "0316531316", false);
        books[4] = new Book("The God Box", 78908655, "1416909001", false);
        books[5] = new Book("Complete Guide to Drawing",  1753488, "978-0-681-10670-3", false);
        books[6] = new Book("Body Trauma: a writer's guide to wounds and injuries",  1753488, "0-89879-741-1", false);
        books[7] = new Book("The Original Cat Bible",  1753488, "978-1-933958-79-8", false);
        books[8] = new Book("Sefer Yetzirah",  1753488, "978-0-87728-855-8", false);
        books[9] = new Book("Contemporary Japanese Workbook 2 Ed.",  1753488, "978-0-8048-4714-8", false);
        books[10] = new Book("Love You Forever",  1753488, "0-920668-37-2", false);
        books[11] = new Book("Ashkenazi Herbalism",  1753488, "978-1-62317-544-3", false);
        books[12] = new Book("Death Note Black Edition IV",  1753488, "978-1-4215-3967-6", false);
        books[13] = new Book("Traditional Prayers, Modern Commentaries Volume 1",  1753488, "1-879045-79-6", false);
        books[14] = new Book("An Introduction to Drawing Animals",  1753488, "0-7858-0394-7", false);
        books[15] = new Book("Dungeon Master's Guide",  1753488, "9780786965625", false);
        books[16] = new Book("That New Baby!",  1753488, "978-0307039507", false);
        books[17] = new Book("Sand Chronicles",  1753488, "978-1-4215-1477-2", false);
        books[18] = new Book("Code Geass: Lelouch of the Rebellion Vol. 8",  1753488, "978-160496205-5", false);
        books[19] = new Book("Girlfriends: The Complete Collection Vol. 2",  1753488, "978-1-937867-09-6", false);



        //public boolean checkOut() {

        }//checkOut method to switch isCheckedOut from false to true

        //public boolean checkIn() {

        }//checkIn method to switch isCheckedOut from true to false




