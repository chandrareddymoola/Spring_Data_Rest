package com.chandra.repository;

import com.chandra.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "books")
// by using above command no need to write rest controller logics
public interface BookRepository extends JpaRepository<Book,Integer> {
}
