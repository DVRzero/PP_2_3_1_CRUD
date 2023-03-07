package web.service;

import org.springframework.stereotype.Service;
import web.entity.User;

import java.util.List;

@Service
public interface UserService {
    List<User> allUsers();

    void addUser(User user);

    void removeUser(Long id);

    void updateUser(User user);
}

