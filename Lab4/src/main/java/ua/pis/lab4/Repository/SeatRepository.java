package ua.pis.lab4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pis.lab4.Model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
