package ru.pavel2107.otus.hw12.repository.datajpa;

import org.springframework.data.repository.CrudRepository;
import ru.pavel2107.otus.hw12.domain.Genre;


public interface GenreRepository extends CrudRepository<Genre, Long> {

}

