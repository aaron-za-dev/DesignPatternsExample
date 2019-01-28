package DAO;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    //La lista simula una base de datos..
    private List<User> users;

    public UserDAOImpl() {

        users = new ArrayList<>();

        users.add(new User(1, "Aaron", "******"));
        users.add(new User(2, "Angel", "******"));
        users.add(new User(3, "Luis", "******"));

    }

    @Override
    public void AddUser(User u) {

        users.add(u);
        System.out.println("El usuario " + u.getName() + " ha sido agregado correctamente");

    }

    @Override
    public User GetUserById(int Id) {

        User u = null;

        for (User x : users) {
            if (x.getUserID() == Id) {

                u = x;

            }
        }

        return u;
    }

    @Override
    public void UpdateUser(User u) {

        for (User x : users) {
            if (x.getUserID() == u.getUserID()) {

                x.setName(u.getName());
                x.setPassword(u.getPassword());

                System.out.println("El usuario con el ID " + u.getUserID() + " ha sido actualizado correctamente");

            }
        }
    }

    @Override
    public void DeleteUser(int Id) {

        users.remove(Id - 1);
        System.out.println("El usuario con el ID " + Id + " ha sido eliminado correctamente");

    }

    @Override
    public List<User> GetAllUsers() {
        return users;
    }

}
