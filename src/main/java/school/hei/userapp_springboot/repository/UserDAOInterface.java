package school.hei.userapp_springboot.repository;

import school.hei.userapp_springboot.model.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface UserDAOInterface {
    User insert(User toInsert);
    List<User> getAll() throws SQLException;
    User getById(int id);
}
