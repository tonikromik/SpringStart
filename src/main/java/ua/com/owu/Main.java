package ua.com.owu;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.models.User;
import ua.com.owu.service.UserService;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/context.xml");

//        User userX = context.getBean("userX", User.class);
//        System.out.println(userX);
//
//        userX.setName("kokos");
//        System.out.println(context.getBean("userX", User.class));


        // Це ми описали в окремому біні
        // даний опис показує як це зробити вручну в мейн класі
//        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
//        factoryBean.setPersistenceXmlLocation("classpath:/META-INF/persistence.xml");
//        factoryBean.setPersistenceUnitManager("xxx");
//        factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//
//
//      UserDAO userDAO = context.getBean(UserDAO.class);
//        User user = new User();
//        user.setName("asdas");
//        userDAO.save(user);

        UserService userService = context.getBean("userService2",UserService.class);
        userService.save("Roman");
    }

}
