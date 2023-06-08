package ua.pis.lab4.Implementation;

import org.springframework.stereotype.Repository;
import ua.pis.lab4.dao.UserDAO;
import ua.pis.lab4.model.User;
import ua.pis.lab4.repository.UserRepository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    private UserRepository userRepository;

    @Override
    public User get(int id) throws SQLException {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAll() throws SQLException, ClassNotFoundException {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) throws SQLException {
    }

    @Override
    public void insert(User user) throws SQLException {
        userRepository.save(user);
    }

    @Override
    public void update(User user) throws SQLException {
        userRepository.save(user);
    }

    @Override
    public void delete(User user) throws SQLException {
        userRepository.delete(user);
    }
}
