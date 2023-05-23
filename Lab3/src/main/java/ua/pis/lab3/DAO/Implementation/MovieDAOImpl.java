package ua.pis.lab3.DAO.Implementation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ua.pis.lab3.DAO.MovieDAO;
import ua.pis.lab3.Model.Movie;
import ua.pis.lab3.Model.User;

import java.sql.SQLException;
import java.util.List;

public class MovieDAOImpl implements MovieDAO {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Movie get(int id) throws SQLException {
        return entityManager.find(Movie.class, id);
    }

    @Override
    public List<Movie> getAll() throws SQLException, ClassNotFoundException {
        TypedQuery<Movie> query = entityManager.createQuery("SELECT u FROM Movie u", Movie.class);
        return query.getResultList();
    }

    @Override
    public int save(Movie movie) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Movie movie) throws SQLException {
        entityManager.persist(movie);
        return 1;
    }

    @Override
    public int update(Movie movie) throws SQLException {
        entityManager.merge(movie);
        return 1;
    }

    @Override
    public int delete(Movie movie) throws SQLException {
        entityManager.remove(movie);
        return 1;
    }
}
