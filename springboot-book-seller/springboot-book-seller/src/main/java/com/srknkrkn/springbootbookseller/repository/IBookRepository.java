package com.srknkrkn.springbootbookseller.repository;

import com.srknkrkn.springbootbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long>
{
}
