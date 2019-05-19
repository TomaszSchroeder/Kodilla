package com.kodilla.patterns.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        // Given
        Library library = new Library("My library");
        Book book1 = new Book("Title1", "Author1", LocalDate.of(2010,8,8));
        Book book2 = new Book("Title2", "Author2", LocalDate.of(2011,8,8));
        Book book3 = new Book("Title3", "Author3", LocalDate.of(2012,8,8));
        Book book4 = new Book("Title4", "Author4", LocalDate.of(2013,8,8));
        Book book5 = new Book("Title5", "Author5", LocalDate.of(2014,8,8));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        // Making a shallow copy
        Library shallowCopyLibrary = null;
        try {
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("My shallow copy of the library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // Making a deep copy
        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("My deep copy of the library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // When
        library.getBooks().remove(book3);

        // Then
        System.out.println(library);
        System.out.println(shallowCopyLibrary);
        System.out.println(deepCopyLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, shallowCopyLibrary.getBooks().size());
        Assert.assertEquals(5, deepCopyLibrary.getBooks().size());
        Assert.assertEquals(shallowCopyLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(shallowCopyLibrary.getBooks().size(), deepCopyLibrary.getBooks().size());
    }
}
