package ua.pis.lab4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pis.lab4.Model.Seance;

public interface SeanceRepository extends JpaRepository<Seance, Integer> {
}
