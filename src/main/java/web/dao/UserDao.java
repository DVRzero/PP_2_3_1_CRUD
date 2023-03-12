package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void addUser(User user);
    User getUserById(long id);
    void updateUser(User user);
    void deleteUser(long id);
}
