package school.hei.userapp_springboot.repository;

import org.springframework.stereotype.Repository;
import school.hei.userapp_springboot.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO implements UserDAOInterface{
    private Connection connection;

    public UserDAO(Connection connection){
        this.connection = connection;
    }

    @Override
    public List<User> getAll() throws SQLException {
        List<User> allUsers = new ArrayList<>();
        String sql = "SELECT * FROM \"user\"";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                convertToList(allUsers, result);
            }
        }

        return allUsers;
    }

    @Override
    public User insert(User toInsert) {
        return null;
    }

    private void convertToList(List<User> allUsers, ResultSet result) throws SQLException {
        allUsers.add(new User(
           result.getInt("id_user"),
           result.getString("username"),
           result.getString("first_name"),
           result.getString("last_name"),
           result.getString("email"),
           result.getString("password")
        ));
    }

    @Override
    public User getById(int id) {
        return null;
    }
}
