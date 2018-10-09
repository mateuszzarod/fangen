package com.designpatterns.matidesignpatterns.prototype3;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Prototype3TestSuite {
    @Test
    public void libraryTestSuite(){
    //Given
        Library library = new Library("Library1");
        Book book1 = new Book("ABC", "Mati", LocalDate.of(1999, 12, 1));
        Book book2 = new Book("Wow", "Ola", LocalDate.of(2000, 2, 11));
        Book book3 = new Book("Zen", "Mike", LocalDate.of(2018, 7, 21));

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        library.books = books;

        Library shallowLibrary = null;
        try {
            shallowLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepLibrary = null;
        try {
            deepLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.getBooks().remove(book1);

        // Then
        System.out.println(library);
        System.out.println(shallowLibrary);
        System.out.println(deepLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, shallowLibrary.getBooks().size());
        Assert.assertEquals(3, deepLibrary.getBooks().size());
    }
}
