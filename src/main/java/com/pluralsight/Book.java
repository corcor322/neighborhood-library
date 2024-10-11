package com.pluralsight;

public class Book {
    private String title = "";
    private int id = 0;
    private String isbn = "";
    private boolean isCheckedOut = false;
    private String checkedOutTo = "";

    public Book(String title, int id, String isbn, boolean isCheckedOut) {
        this.title = title;
        this.id = id;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String toString() {
        return "ID: " + id + ", Title: " + title + " ISBN: " + isbn;
    }

}
