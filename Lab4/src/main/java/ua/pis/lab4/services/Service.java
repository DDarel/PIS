package ua.pis.lab4.services;

import java.sql.SQLException;
import java.util.List;

public interface Service<T>{
    T getById(int id) throws SQLException;
    List<T> getAll() throws SQLException, ClassNotFoundException;

    void insert(T t) throws SQLException;

    void update (T t) throws SQLException;

    void delete (T t) throws SQLException;
}
