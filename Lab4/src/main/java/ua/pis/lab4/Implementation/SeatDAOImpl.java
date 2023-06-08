package ua.pis.lab4.Implementation;

import ua.pis.lab4.dao.SeatDAO;
import ua.pis.lab4.model.Seat;
import ua.pis.lab4.repository.SeatRepository;

import java.sql.SQLException;
import java.util.List;

public class SeatDAOImpl implements SeatDAO {

    private SeatRepository seatRepository;

    @Override
    public Seat get(int id) throws SQLException {
        return seatRepository.findById(id).orElse(null);
    }

    @Override
    public List<Seat> getAll() throws SQLException, ClassNotFoundException {
        return seatRepository.findAll();
    }

    @Override
    public void save(Seat seat) throws SQLException {
    }

    @Override
    public void insert(Seat seat) throws SQLException {
        seatRepository.save(seat);
    }

    @Override
    public void update(Seat seat) throws SQLException {
        seatRepository.save(seat);
    }

    @Override
    public void delete(Seat seat) throws SQLException {
        seatRepository.delete(seat);
    }
}
