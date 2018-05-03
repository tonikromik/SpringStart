package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.models.User;
import ua.com.owu.service.UserService;

@Service("userService2")
public class UserServiceImpl2 implements UserService {

    @Autowired
    private UserDAO userDAO;

    public UserServiceImpl2() {
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserServiceImpl2(UserDAO userDAO) {

        this.userDAO = userDAO;
    }

    @Override
    public void save(String name) {

        User user = new User();
        user.setName(name);
        userDAO.save(user);
    }
}
