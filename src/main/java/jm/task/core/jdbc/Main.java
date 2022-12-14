package jm.task.core.jdbc;



import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util util = new Util();
        util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Elena", "Ivanova", (byte) 32);
        userDao.saveUser("Petr", "Fedorov", (byte) 72);
        userDao.saveUser("Irina", "Lukyanova", (byte) 41);
        userDao.saveUser("Ivan", "Ivanov", (byte) 38);

        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();

    }
}
