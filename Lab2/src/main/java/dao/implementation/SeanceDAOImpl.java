package dao.implementation;

import connection.ConnectionPool;
import dao.SeanceDAO;
import model.Seance;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SeanceDAOImpl implements SeanceDAO {

    ConnectionPool connection = new ConnectionPool();

    public SeanceDAOImpl() throws SQLException, ClassNotFoundException {
    }

    @Override
    public Seance get(int id) throws SQLException {
        Connection con = connection.getConnection();
        Seance seance = null;
        String sql = "SELECT * FROM localcinema.seances WHERE seance_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int seanceId = rs.getInt("seance_id");
            Date seanceDate = rs.getDate("seance_date");
            Time seanceTime = rs.getTime("seance_time");
            int movieIdRelated = rs.getInt("movie_id_related");
            seance = new Seance(seanceId, seanceDate, seanceTime, movieIdRelated);
        }
        return seance;
    }

    @Override
    public List<Seance> getAll() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = connection.getConnection();
        Seance seance = null;
        List<Seance> seances = new ArrayList<>();
        String sql = "SELECT * FROM localcinema.seances";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int seanceId = rs.getInt("seance_id");
            Date seanceDate = rs.getDate("seance_date");
            Time seanceTime = rs.getTime("seance_time");
            int movieIdRelated = rs.getInt("movie_id_related");
            seance = new Seance(seanceId, seanceDate, seanceTime, movieIdRelated);
            seances.add(seance);
        }
        return seances;
    }

    @Override
    public int save(Seance seance) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Seance seance) throws SQLException {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO `localcinema`.`seances` (`seance_date`, `seance_time`, `movie_id_related`) VALUES ( ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, seance.getDate());
        ps.setTime(2, seance.getTime());
        ps.setInt(3, seance.getMovie_id());
        int result = ps.executeUpdate();
        return result;
    }

    @Override
    public int update(Seance seance) throws SQLException {
        Connection con = connection.getConnection();
        String sql = "UPDATE localcinema.seances set seance_date = ?, seance_time = ?, movie_id_related = ? WHERE seance_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, seance.getDate());
        ps.setTime(2, seance.getTime());
        ps.setInt(3, seance.getMovie_id());
        ps.setInt(4, seance.getId());
        int result = ps.executeUpdate();
        return result;
    }

    @Override
    public int delete(Seance seance) throws SQLException {
        Connection con = connection.getConnection();
        String sql = "DELETE FROM localcinema.seances WHERE seance_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, seance.getId());
        int result = ps.executeUpdate();
        return result;
    }
}
