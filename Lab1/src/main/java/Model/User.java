package Model;

public class User {
    private int id;
    private String name;
    private String surname;
    private int roleId;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int id, String name, String surname, int roleId, String email, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.roleId = roleId;
        this.email = email;
        this.password = password;
    }

    public User(){}

    public String outInfo(){
        String info =
                "ID: " + Integer.toString(id) + "\n" +
                "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "RoleID: " + Integer.toString(roleId) + "\n" +
                "Email: " + email + "\n" +
                "Password: " + password + "\n";
        return info;
    }
}
