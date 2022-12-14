package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> findAll();

    User findOne(int id);

    void save(User user);

    User update(User user);

    void delete(int id);
}
