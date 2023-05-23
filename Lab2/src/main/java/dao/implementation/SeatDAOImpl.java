package dao.implementation;

import connection.ConnectionPool;
import dao.SeatDAO;
import model.Seat;

import java.sql.SQLException;
import java.util.List;

public class SeatDAOImpl implements SeatDAO {

    ConnectionPool connection = new ConnectionPool();

    public SeatDAOImpl() throws SQLException, ClassNotFoundException {
    }

    @Override
    public Seat get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Seat> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public int save(Seat seat) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Seat seat) throws SQLException {
        return 0;
    }

    @Override
    public int update(Seat seat) throws SQLException {
        return 0;
    }

    @Override
    public int delete(Seat seat) throws SQLException {
        return 0;
    }
}
