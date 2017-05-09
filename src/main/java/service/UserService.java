package service;

import dao.UserDAO;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Владислав on 08.05.2017.
 */
@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

   public List<User> getAllUsers(){
       return userDAO.getAllUsers();
   }
}
