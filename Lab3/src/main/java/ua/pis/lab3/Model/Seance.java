package ua.pis.lab3.Model;

import java.sql.Date;
import java.sql.Time;

public class Seance {
    private int id;
    private Date date;
    private Time time;
    private int movie_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public Seance(int id, Date date, Time time, int movie_id) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.movie_id = movie_id;
    }

    public Seance(){};
}
