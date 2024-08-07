package com.cruds.spring6webapp.services;

import com.cruds.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
