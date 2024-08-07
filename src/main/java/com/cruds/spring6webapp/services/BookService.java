package com.cruds.spring6webapp.services;

import com.cruds.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
