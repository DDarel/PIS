package ua.pis.lab4.Model;

public class Seat {
    private int seance_id;
    private int number;
    private int user_id;

    public int getSeance_id() {
        return seance_id;
    }

    public void setSeance_id(int seance_id) {
        this.seance_id = seance_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Seat(int seance_id, int number, int user_id) {
        this.seance_id = seance_id;
        this.number = number;
        this.user_id = user_id;
    }
    public Seat(){};
}
