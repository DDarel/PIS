package ua.pis.lab3;

import ua.pis.lab3.Model.Movie;
import ua.pis.lab3.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Date;
import java.sql.SQLException;

public class Lab3Application {

    public static void main(String[] args) throws SQLException {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("asd");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        User user = new User(0, "Misha", "Renskiy", 1, "chernuyvlastelin@gmail.com", "lox123");
        entityManager.persist(user);

        entityManager.getTransaction().commit();
    }
}
