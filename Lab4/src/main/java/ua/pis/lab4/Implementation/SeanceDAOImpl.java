package ua.pis.lab4.Implementation;

import ua.pis.lab4.dao.SeanceDAO;
import ua.pis.lab4.model.Seance;
import ua.pis.lab4.repository.SeanceRepository;

import java.sql.SQLException;
import java.util.List;

public class SeanceDAOImpl implements SeanceDAO {

    private SeanceRepository seanceRepository;

    @Override
    public Seance get(int id) throws SQLException {
        return seanceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Seance> getAll() throws SQLException, ClassNotFoundException {
        return seanceRepository.findAll();
    }

    @Override
    public void save(Seance seance) throws SQLException {
    }

    @Override
    public void insert(Seance seance) throws SQLException {
        seanceRepository.save(seance);
    }

    @Override
    public void update(Seance seance) throws SQLException {
        seanceRepository.save(seance);
    }

    @Override
    public void delete(Seance seance) throws SQLException {
        seanceRepository.delete(seance);
    }
}
