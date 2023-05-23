package ua.pis.lab4.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.pis.lab4.DAO.MovieDAO;
import ua.pis.lab4.Repository.MovieRepository;
import ua.pis.lab4.Model.Movie;

import java.sql.SQLException;
import java.util.List;

@Repository
public class MovieDAOImpl implements MovieDAO {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie get(int id) throws SQLException {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public List<Movie> getAll() throws SQLException, ClassNotFoundException {
        return (List<Movie>) movieRepository.findAll();
    }

    @Override
    public void save(Movie movie) throws SQLException {
    }

    @Override
    public void insert(Movie movie) throws SQLException {
        movieRepository.save(movie);
    }

    @Override
    public void update(Movie movie) throws SQLException {
        movieRepository.save(movie);
    }

    @Override
    public void delete(Movie movie) throws SQLException {
        movieRepository.delete(movie);
    }
}
