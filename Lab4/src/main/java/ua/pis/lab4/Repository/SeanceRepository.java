package ua.pis.lab4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pis.lab4.model.Seance;

public interface SeanceRepository extends JpaRepository<Seance, Integer> {
}
