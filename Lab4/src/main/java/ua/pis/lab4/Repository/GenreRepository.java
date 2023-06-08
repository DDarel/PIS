package ua.pis.lab4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pis.lab4.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
