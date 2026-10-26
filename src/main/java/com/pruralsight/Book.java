package com.pruralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book( int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }
    public Book( int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;

    }

    public void setId(int id) {
        this.id = id;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setIsCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }
    public void setCheckOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
    public int getId() {
        return id;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }
    public String getCheckedOutTo() {
        return checkedOutTo;
    }
    public void checkOut(String name) {
        this.isCheckedOut = true;
        this.checkedOutTo = name;
    }

    // Check in a book
    public void checkIn() {
        this.isCheckedOut = false;
        this.checkedOutTo = null;

    }


}
