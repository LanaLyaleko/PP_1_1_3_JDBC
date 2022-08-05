package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;


public class Main {
    public static void main(String[] args)  {

        UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();

        userDao.dropUsersTable();
        userDao.createUsersTable();
        userDao.saveUser("John","Mike", (byte) 31);
        userDao.removeUserById(0);
        userDao.getAllUsers();
        userDao.cleanUsersTable();

    }
}