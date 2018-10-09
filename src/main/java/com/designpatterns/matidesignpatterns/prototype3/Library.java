package com.designpatterns.matidesignpatterns.prototype3;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    public Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library cloneLibrary = (Library) super.clone();
        cloneLibrary.books = new HashSet<>();
        for (Book book: books){
            Book clonedBook = new Book(book.getTitle(), book.getTitle(), book.getPublicationDate());
            cloneLibrary.getBooks().add(book);
        }
        return cloneLibrary;
    }

}