package az.edu.turing.springintro2.controller;

import az.edu.turing.springintro2.dao.UserEntity;
import az.edu.turing.springintro2.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@RestController

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<UserEntity> findAll() {
        System.err.println(userService.toString());
        return userService.findAll();
    }
    @GetMapping("/{userId}")
    public List<UserEntity> findById(int userId){
        System.err.println(userService.toString());
//        return userService.findById();
        return null;


    }
}
