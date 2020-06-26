package com.practice;
public class Book {
    private String Name;
    private int pages;
    public Book(String Name, int pages) {
        this.Name = Name;
        this.pages = pages;
    }

    public Book() {
        this.Name = "";
        this.pages = 0;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return Name;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book:"+this.Name+" Pages:"+this.pages;
    }
}
