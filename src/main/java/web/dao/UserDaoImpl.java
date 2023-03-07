package web.dao;

import org.springframework.stereotype.*;
import web.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> allUsers() {
        return em.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public void removeUser(Long id) {
        User user = em.find(User.class, id);
        em.remove(user);
    }

    @Override
    public void updateUser(User user) {
        User user1 = em.find(User.class, user.getId());
        user.setName(user1.getName());
        user.setSurname(user1.getSurname());
    }
}
