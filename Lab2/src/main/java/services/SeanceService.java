package services;

import dao.implementation.SeanceDAOImpl;
import model.Seance;

import java.sql.SQLException;
import java.util.List;

public class SeanceService implements Service<Seance>{

    private SeanceDAOImpl seanceDAOImpl;

    @Override
    public Seance getById(int id) throws SQLException {
        return seanceDAOImpl.get(id);
    }

    @Override
    public List<Seance> getAll() throws SQLException, ClassNotFoundException {
        return seanceDAOImpl.getAll();
    }

    @Override
    public void insert(Seance seance) throws SQLException {
        seanceDAOImpl.insert(seance);
    }

    @Override
    public void update(Seance seance) throws SQLException {
        seanceDAOImpl.update(seance);
    }

    @Override
    public void delete(Seance seance) throws SQLException {
        seanceDAOImpl.delete(seance);
    }
}
