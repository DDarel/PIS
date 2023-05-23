package ua.pis.lab4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pis.lab4.Model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
