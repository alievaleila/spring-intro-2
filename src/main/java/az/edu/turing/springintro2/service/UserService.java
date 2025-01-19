package az.edu.turing.springintro2.service;

import az.edu.turing.springintro2.dao.UserDao;
import az.edu.turing.springintro2.dao.UserEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope(scopeName = "singleton", proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Scope(scopeName="request", proxyMode=ScopedProxyMode.TARGET_CLASS)
//@Scope(scopeName="prototype")
public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<UserEntity> findAll() {
        return userDao.findAll();
    }
}