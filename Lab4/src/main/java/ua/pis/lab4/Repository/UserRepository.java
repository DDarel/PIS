package ua.pis.lab4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pis.lab4.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
