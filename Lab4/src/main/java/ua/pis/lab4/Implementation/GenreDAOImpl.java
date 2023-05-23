package ua.pis.lab4.Implementation;

import ua.pis.lab4.DAO.GenreDAO;
import ua.pis.lab4.Model.Genre;
import ua.pis.lab4.Repository.GenreRepository;

import java.sql.SQLException;
import java.util.List;

public class GenreDAOImpl implements GenreDAO {

    private GenreRepository genreRepository;

    @Override
    public Genre get(int id) throws SQLException {
        return genreRepository.findById(id).orElse(null);
    }

    @Override
    public List<Genre> getAll() throws SQLException, ClassNotFoundException {
        return genreRepository.findAll();
    }

    @Override
    public void save(Genre genre) throws SQLException {
    }

    @Override
    public void insert(Genre genre) throws SQLException {
        genreRepository.save(genre);
    }

    @Override
    public void update(Genre genre) throws SQLException {
        genreRepository.save(genre);
    }

    @Override
    public void delete(Genre genre) throws SQLException {
        genreRepository.delete(genre);
    }
}
