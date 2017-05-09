package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import java.util.List;

/**
 * Created by Владислав on 08.05.2017.
 */
@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userServicel;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
public @ResponseBody
List getAllUsers(){
    return userServicel.getAllUsers();
}
 }
