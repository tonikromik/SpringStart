package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.models.User;
import ua.com.owu.service.UserService;

@Service
public class UserServiceImpl1 implements UserService {

    @Autowired
    private UserDAO userDAO;

    public UserServiceImpl1() {
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserServiceImpl1(UserDAO userDAO) {

        this.userDAO = userDAO;
    }

    public void save(String name) {
        if (name != null && !name.isEmpty()){
            User user = new User();
            user.setName(name);
            userDAO.save(user);
        } else {
            System.out.println("error");
        }

    }
}
