package com.jgrabsky.springwebapp.repositories;

import com.jgrabsky.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
