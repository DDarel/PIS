package DAO;

import Connection.ConnectionPool;
import Model.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAOImpl implements MovieDAO {

    ConnectionPool connection = new ConnectionPool();

    public MovieDAOImpl() throws SQLException {
    }

    @Override
    public Movie get(int id) throws SQLException {
        Connection con = connection.getConnection();
        Movie movie = null;
        String sql = "SELECT movie_id, movie_name, movie_duration, movie_director, movie_poster_path, movie_rent_start, movie_rent_end FROM cinema.films WHERE film_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int movieId = rs.getInt("movie_id");
            String movieName = rs.getString("movie_name");
            int movieDuration = rs.getInt("movie_duration");
            String movieDirector = rs.getString("movie_director");
            String moviePosterPath = rs.getString("movie_poster_path");
            Date movieRentStart = rs.getDate("movie_rent_start");
            Date movieRentEnd = rs.getDate("movie_rent_end");

            movie = new Movie(movieId, movieName, movieDuration,movieDirector, moviePosterPath, movieRentStart, movieRentEnd);
        }
        return movie;
    }

    @Override
    public List<Movie> getAll() throws SQLException {
        Connection con = connection.getConnection();
        List<Movie> movies = new ArrayList<>();
        Movie movie = null;
        String sql = "SELECT movie_id, movie_name, movie_duration, movie_director, movie_poster_path, movie_rent_start, movie_rent_end FROM cinema.films";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int movieId = rs.getInt("movie_id");
            String movieName = rs.getString("movie_name");
            int movieDuration = rs.getInt("movie_duration");
            String movieDirector = rs.getString("movie_director");
            String moviePosterPath = rs.getString("movie_poster_path");
            Date movieRentStart = rs.getDate("movie_rent_start");
            Date movieRentEnd = rs.getDate("movie_rent_end");
            movie = new Movie(movieId, movieName, movieDuration,movieDirector, moviePosterPath, movieRentStart, movieRentEnd);
            movies.add(movie);
        }
        return movies;
    }

    @Override
    public int save(Movie movie) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Movie movie) throws SQLException {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO movies (movie_name, movie_duration, movie_director, movie_poster_path, movie_rent_start, movie_rent_end) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, movie.getName());
        ps.setInt(2, movie.getDuration());
        ps.setString(3, movie.getDirector());
        ps.setString(4, movie.getPosterPath());
        ps.setDate(5, movie.getRentStart());
        ps.setDate(6,movie.getRentEnd());
        int result = ps.executeUpdate();
        return result;
    }

    @Override
    public int update(Movie movie) throws SQLException {
        Connection con = connection.getConnection();
        String sql = "UPDATE localcinema.movies set movie_name = ?, movie_duration = ?, movie_director = ?, movie_poster_path = ?, movie_rent_start = ?, movie_rent_end = ? WHERE movie_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, movie.getName());
        ps.setInt(2, movie.getDuration());
        ps.setString(3, movie.getDirector());
        ps.setString(4, movie.getPosterPath());
        ps.setDate(5, movie.getRentStart());
        ps.setDate(6,movie.getRentEnd());
        ps.setInt(7,movie.getId());
        int result = ps.executeUpdate();
        return result;
    }

    @Override
    public int delete(Movie movie) throws SQLException {
        Connection con = connection.getConnection();
        String sql = "DELETE FROM localcinema.movies WHERE movie_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, movie.getId());
        int result = ps.executeUpdate();
        return result;
    }
}
