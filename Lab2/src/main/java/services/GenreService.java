package services;

import dao.implementation.GenreDAOImpl;
import model.Genre;

import java.sql.SQLException;
import java.util.List;

public class GenreService implements Service<Genre>{

    private GenreDAOImpl genreDAOImpl;

    @Override
    public Genre getById(int id) throws SQLException {
        return genreDAOImpl.get(id);
    }

    @Override
    public List<Genre> getAll() throws SQLException, ClassNotFoundException {
        return genreDAOImpl.getAll();
    }

    @Override
    public void insert(Genre genre) throws SQLException {
        genreDAOImpl.insert(genre);
    }

    @Override
    public void update(Genre genre) throws SQLException {
        genreDAOImpl.update(genre);
    }

    @Override
    public void delete(Genre genre) throws SQLException {
        genreDAOImpl.delete(genre);
    }
}
