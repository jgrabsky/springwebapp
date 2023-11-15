package com.jgrabsky.springwebapp.repositories;

import com.jgrabsky.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
