package ua.pis.lab4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pis.lab4.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
