package dao.implementation;

import connection.ConnectionPool;
import dao.GenreDAO;
import model.Genre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GenreDAOImpl implements GenreDAO {

    ConnectionPool connection = new ConnectionPool();

    public GenreDAOImpl() throws SQLException, ClassNotFoundException {
    }

    @Override
    public Genre get(int id) throws SQLException {
        Connection con = connection.getConnection();
        Genre genre = null;
        String sql = "SELECT * FROM localcinema.genres WHERE genre_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int genreId = rs.getInt("genre_id");
            String genreName = rs.getString("genre_name");
            String genreDescription = rs.getString("genre_description");
            genre = new Genre(genreId, genreName, genreDescription);
        }
        return genre;
    }

    @Override
    public List<Genre> getAll() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = connection.getConnection();
        List<Genre> genres = new ArrayList<>();
        Genre genre = null;
        String sql = "SELECT * FROM localcinema.genres";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int genreId = rs.getInt("genre_id");
            String genreName = rs.getString("genre_name");
            String genreDescription = rs.getString("genre_description");
            genre = new Genre(genreId, genreName, genreDescription);
            genres.add(genre);
        }
        return genres;
    }

    @Override
    public int save(Genre genre) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Genre genre) throws SQLException {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO localcinema.genres (genre_name, genre_description) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, genre.getName());
        ps.setString(2, genre.getDescription());
        int result = ps.executeUpdate();
        return result;
    }

    @Override
    public int update(Genre genre) throws SQLException {
        Connection con = connection.getConnection();
        String sql = "UPDATE localcinema.genres set genre_id = ?, genre_description = ? WHERE genre_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, genre.getName());
        ps.setString(2, genre.getDescription());
        ps.setInt(3, genre.getId());
        int result = ps.executeUpdate();
        return result;
    }

    @Override
    public int delete(Genre genre) throws SQLException {
        Connection con = connection.getConnection();
        String sql = "DELETE FROM localcinema.genres WHERE genre_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, genre.getId());
        int result = ps.executeUpdate();
        return result;
    }
}
