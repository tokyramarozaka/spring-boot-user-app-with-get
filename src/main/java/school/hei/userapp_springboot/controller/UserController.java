package school.hei.userapp_springboot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.userapp_springboot.model.User;
import school.hei.userapp_springboot.service.UserService;

import java.sql.SQLException;
import java.util.List;

@RestController
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        System.out.println("Appel du constructeur de controller");
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() throws SQLException {
        return service.getAllUsers();
    }
}
