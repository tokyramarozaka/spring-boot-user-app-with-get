package school.hei.userapp_springboot.service;

import org.springframework.stereotype.Service;
import school.hei.userapp_springboot.model.User;
import school.hei.userapp_springboot.repository.UserDAO;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {
    private UserDAO dao;

    public UserService(UserDAO dao) {
        System.out.println("Appel du constructeur de service");
        this.dao = dao;
    }

    // le metier de votre application : tous les traitements de votre theme.
    public List<User> getAllUsers() throws SQLException {
        return dao.getAll();
    }
}
