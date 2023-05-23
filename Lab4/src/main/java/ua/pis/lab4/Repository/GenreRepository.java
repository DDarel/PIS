package ua.pis.lab4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pis.lab4.Model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
