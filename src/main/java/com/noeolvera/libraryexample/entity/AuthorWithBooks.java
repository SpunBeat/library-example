package com.noeolvera.libraryexample.entity;

import jakarta.persistence.*;

@Entity
public class AuthorWithBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Author_ID;

    private String FirstName;

    private String LastName;

    private Integer Book_ID;

    private String Title;

    private Integer Year;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getBook_ID() {
        return Book_ID;
    }

    public void setBook_ID(Integer book_ID) {
        Book_ID = book_ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    public Integer getAuthor_ID() {
        return Author_ID;
    }

    public void setAuthor_ID(Integer author_ID) {
        Author_ID = author_ID;
    }
}
