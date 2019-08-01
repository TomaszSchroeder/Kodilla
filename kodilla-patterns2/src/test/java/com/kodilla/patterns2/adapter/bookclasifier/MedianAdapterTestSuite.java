package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // Given
        Book book1 = new Book("author1", "book1", 1900, "4455");
        Book book2 = new Book("author2", "book2", 2000, "4455");
        Book book3 = new Book("author3", "book3", 1950, "4455");
        Book book4 = new Book("author4", "book4", 2010, "4455");
        Book book5 = new Book("author5", "book5", 2015, "4455");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int median = medianAdapter.publicationYearMedian(books);

        // Then
        assertEquals(2000, median);
    }
}
