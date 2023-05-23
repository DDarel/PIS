package services;

import connection.ConnectionPool;
import dao.implementation.UserDAOImpl;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserService implements Service<User>{

    ConnectionPool connection = new ConnectionPool();
    private static UserDAOImpl userDAO;

    public UserService() throws SQLException, ClassNotFoundException {
    }

    @Override
    public User getById(int id) throws SQLException {
        return userDAO.get(id);
    }

    @Override
    public List<User> getAll() throws SQLException, ClassNotFoundException {
        return userDAO.getAll();
    }

    @Override
    public void insert(User user) throws SQLException {
        userDAO.insert(user);
    }

    @Override
    public void update(User user) throws SQLException {
        userDAO.update(user);
    }

    @Override
    public void delete(User user) throws SQLException {
        userDAO.delete(user);
    }

    public User getByEmail(String email) throws SQLException, ClassNotFoundException {
        Connection con = connection.getConnection();
        User user = null;
        String sql = "SELECT user_id, user_name, user_surname, user_role_id, user_email, user_password FROM users WHERE user_email = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, email);
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

    public boolean validate(User user) throws SQLException, ClassNotFoundException {
        Connection con = connection.getConnection();
        List<User> users = getAll();
        for (int i = 0 ; i < users.size(); i++ ){
            if (user.getEmail().equals(users.get(i).getEmail()) && user.getPassword().equals(users.get(i).getPassword())){
                return true;
            }
        }
        return false;
    }

}
