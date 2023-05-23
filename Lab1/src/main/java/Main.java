import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import DAO.UserDAO;
import DAO.UserDAOImpl;
import Model.User;
import org.apache.commons.codec.digest.DigestUtils;

public class Main {
    public static void main(String args[]) throws SQLException {


        UserDAO userDAO = new UserDAOImpl();
        User useradd = new User(0,"Alex", "Simple", 2, "test@mail.com", "password");
        int result = userDAO.insert(useradd);
        System.out.println(result);
//
//        User user = userDAO.get(8); // <------- ID change
//        if (DigestUtils.md5Hex(useradd.getPassword()).equals(user.getPassword())){
//            System.out.println("Succes");
//        } else System.out.println("Not Succes");
//
//        User userupdate = new User(user.getId(),"Alex1", "Simple1", 2, "test@mail.com1", "password1");
//        int resultupdate = userDAO.update(userupdate);
//        System.out.println(resultupdate);
//
//        user = userDAO.get(user.getId());
//        System.out.println(user.outInfo());
//
//        int resultdelete = userDAO.delete(userupdate);
//        System.out.println(resultdelete);
//
//        user = userDAO.get(user.getId());
//        if(user!=null) {
//            System.out.println(user.outInfo());
//        } else System.out.println("Deleted");
//
//        List<User> users = userDAO.getAll();
//        for(int i = 0; i < users.size(); i++){
//            System.out.println(users.get(i).outInfo());
//        }
    }

}
