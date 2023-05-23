package services;

import dao.implementation.MovieDAOImpl;
import model.Movie;

import java.sql.SQLException;
import java.util.List;

public class MovieService implements Service<Movie>{
    private static MovieDAOImpl movieDAOImpl;
    @Override
    public Movie getById(int id) throws SQLException {
        return movieDAOImpl.get(id);
    }

    @Override
    public List<Movie> getAll() throws SQLException, ClassNotFoundException {
        return movieDAOImpl.getAll();
    }

    @Override
    public void insert(Movie movie) throws SQLException {
        movieDAOImpl.insert(movie);
    }

    @Override
    public void update(Movie movie) throws SQLException {
        movieDAOImpl.update(movie);
    }

    @Override
    public void delete(Movie movie) throws SQLException {
        movieDAOImpl.delete(movie);
    }
}
