package com.srknkrkn.springbootbookseller.service;

import com.srknkrkn.springbootbookseller.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    //deleting book by id//
    void deleteBook(Long id);

    //find all books//
    List<Book> findAllBooks();
}
