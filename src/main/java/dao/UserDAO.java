package dao;

import model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Владислав on 08.05.2017.
 */
@Repository
public class UserDAO {
private List<User> list = Arrays.asList(new User("admin", "admin"),
        new User("user1", "user1"));

public List getAllUsers(){
    return list;
    }
}
