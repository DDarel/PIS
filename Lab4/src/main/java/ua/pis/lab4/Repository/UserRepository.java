package ua.pis.lab4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pis.lab4.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
