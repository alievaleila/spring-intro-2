package az.edu.turing.springintro2;

import az.edu.turing.springintro2.controller.UserController;
import az.edu.turing.springintro2.dao.UserDao;
import az.edu.turing.springintro2.dao.UserEntity;
import az.edu.turing.springintro2.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class BeanConfig {
//    @Bean
//    public UserController userController(){
//        return new UserController(userService());
//    }
//
//    @Bean
//    public UserService userService(){
//        return new UserService(userDao());
//    }
//
//    @Bean
//    public UserDao userDao(){
//        return new UserDao();
//    }
//
//}
