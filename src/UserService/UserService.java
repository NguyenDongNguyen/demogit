
package UserService;

import User.User;
import UserDao.UserDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserService {
    private final UserDao userDao;
    public UserService(){
        userDao=new UserDao();
    }
    public List<User> getAllUser() {
        try {
            return userDao.getAllUser();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public User getUserByUserName(String userName){
        return userDao.getUserByUserName(userName);
    }
    public User getUserById(int id){
        return userDao.getUserById(id);
    }
} 
