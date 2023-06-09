package ua.pis.lab4.dao;

import java.util.List;
import java.sql.SQLException;

public interface DAO<T> {
    T get(int id) throws SQLException;

    List<T> getAll() throws SQLException, ClassNotFoundException;

    void save(T t) throws SQLException;

    void insert(T t) throws SQLException;

    void update (T t) throws SQLException;

    void delete (T t) throws SQLException;
}
