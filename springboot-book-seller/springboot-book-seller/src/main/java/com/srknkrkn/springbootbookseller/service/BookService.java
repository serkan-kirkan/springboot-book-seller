package com.srknkrkn.springbootbookseller.service;

import com.srknkrkn.springbootbookseller.model.Book;
import com.srknkrkn.springbootbookseller.repository.IBookRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookService implements IBookService
{
    private final IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //saving book//
    @Override
    public Book saveBook(Book book)
    {
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    //deleting book by id//
    @Override
    public void deleteBook(Long id)
    {
        bookRepository.deleteById(id);
    }

    //find all books//
    @Override
    public List<Book> findAllBooks()
    {
        return bookRepository.findAll();
    }


}
