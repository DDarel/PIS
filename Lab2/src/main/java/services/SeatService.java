package services;

import dao.implementation.SeatDAOImpl;
import model.Seat;

import java.sql.SQLException;
import java.util.List;

public class SeatService implements Service<Seat>{

    private SeatDAOImpl seatDAOImpl;

    @Override
    public Seat getById(int id) throws SQLException {
        return seatDAOImpl.get(id);
    }

    @Override
    public List<Seat> getAll() throws SQLException, ClassNotFoundException {
        return seatDAOImpl.getAll();
    }

    @Override
    public void insert(Seat seat) throws SQLException {
        seatDAOImpl.insert(seat);
    }

    @Override
    public void update(Seat seat) throws SQLException {
        seatDAOImpl.update(seat);
    }

    @Override
    public void delete(Seat seat) throws SQLException {
        seatDAOImpl.delete(seat);
    }
}
