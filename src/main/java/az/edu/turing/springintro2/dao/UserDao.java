package az.edu.turing.springintro2.dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@Repository
public class UserDao {
    public static final List<UserEntity> USERS = new ArrayList<>(Arrays.asList(
            new UserEntity(1, "ELvin"),
            new UserEntity(2, "Leyla")
    ));

    public List<UserEntity> findAll() {
        return USERS;
    }

    public Optional<UserEntity> findById(int id) {
        return USERS.stream()
                .filter(userEntity -> id == userEntity.id())
                .findFirst();
    }

    public UserEntity create(UserEntity userEntity) {
        USERS.add(userEntity);
        return userEntity;
    }


}
