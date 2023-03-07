package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {

    List<User> allUsers();

    void addUser(User user);

    void removeUser(Long id);

    void updateUser(User user);
}
