package DAO;

import Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Connection.ConnectionPool;
import org.apache.commons.codec.digest.DigestUtils;

public class UserDAOImpl implements UserDAO{

    ConnectionPool connection = new ConnectionPool();

    public UserDAOImpl() throws SQLException {
    }

    public User get(int id) throws SQLException {
        Connection con = connection.getConnection();
        User user = null;
        String sql = "SELECT user_id, user_name, user_surname, user_role_id, user_email, user_password FROM users WHERE user_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int userId = rs.getInt("user_id");
            String userName = rs.getString("user_name");
            String userSurname = rs.getString("user_surname");
            int userRoleId = rs.getInt("user_role_id");
            String userEmail = rs.getString("user_email");
            String userPassword = rs.getString("user_password");
            user = new User(userId, userName, userSurname, userRoleId, userEmail, userPassword);
        }
        return user;
    }

    public List<User> getAll() throws SQLException {
        Connection con = connection.getConnection();
        User user = null;
        List<User> users = new ArrayList<>();
        String sql = "SELECT user_id, user_name, user_surname, user_role_id, user_email, user_password FROM localcinema.users";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int userId = rs.getInt("user_id");
            String userName = rs.getString("user_name");
            String userSurname = rs.getString("user_surname");
            int userRoleId = rs.getInt("user_role_id");
            String userEmail = rs.getString("user_email");
            String userPassword = rs.getString("user_password");
            user = new User(userId, userName, userSurname, userRoleId, userEmail, userPassword);
            users.add(user);
        }
        return users;
    }

    public int save(User user) throws SQLException {
        return 0;
    }

    public int insert(User user) throws SQLException {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO users (user_name, user_surname, user_role_id, user_email, user_password) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, user.getName());
        ps.setString(2, user.getSurname());
        ps.setInt(3, user.getRoleId());
        ps.setString(4, user.getEmail());
        ps.setString(5, DigestUtils.md5Hex(user.getPassword()));
        int result = ps.executeUpdate();
        return result;
    }

    public int update(User user) throws SQLException {
        Connection con = connection.getConnection();
        String sql = "UPDATE localcinema.users set user_name = ?, user_surname = ?, user_role_id = ?, user_email = ?, user_password = ? WHERE user_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, user.getName());
        ps.setString(2, user.getSurname());
        ps.setInt(3, user.getRoleId());
        ps.setString(4, user.getEmail());
        ps.setString(5, user.getPassword());
        ps.setInt(6, user.getId());
        int result = ps.executeUpdate();
        return result;
    }

    public int delete(User user) throws SQLException{
        Connection con = connection.getConnection();
        String sql = "DELETE FROM localcinema.users WHERE user_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, user.getId());
        int result = ps.executeUpdate();
        return result;
    }
}
