package com.jgrabsky.springwebapp.repositories;

import com.jgrabsky.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{
}
