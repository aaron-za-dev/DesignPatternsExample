package DAO;

import java.util.List;

public interface UserDAO {

    void AddUser(User u);

    User GetUserById(int Id);

    void UpdateUser(User u);

    void DeleteUser(int Id);

    List<User> GetAllUsers();


}
