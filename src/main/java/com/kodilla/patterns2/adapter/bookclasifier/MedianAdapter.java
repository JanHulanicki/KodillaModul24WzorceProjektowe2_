package com.kodilla.patterns2.adapter.bookclasifier;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import java.util.*;
public class MedianAdapter extends MedianAdaptee  implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>() ;
        for (com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book : bookSet) {
            bookMap.put(new BookSignature(book.getSignature()), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }
        return medianPublicationYear(bookMap);
    }
}