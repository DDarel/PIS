package ua.pis.lab3.DAO.Implementation;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import ua.pis.lab3.DAO.UserDAO;
import ua.pis.lab3.Model.User;

import java.sql.SQLException;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private EntityManager entityManager;

    @Override
    public User get(int id) throws SQLException {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> getAll() throws SQLException, ClassNotFoundException {
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class);
        return query.getResultList();
    }

    @Override
    public int save(User user) throws SQLException {
        return 0;
    }

    @Override
    public int insert(User user) throws SQLException {
        entityManager.persist(user);
        return 1;
    }

    @Override
    public int update(User user) throws SQLException {
        entityManager.merge(user);
        return 1;
    }

    @Override
    public int delete(User user) throws SQLException {
        entityManager.remove(user);
        return 1;
    }
}
