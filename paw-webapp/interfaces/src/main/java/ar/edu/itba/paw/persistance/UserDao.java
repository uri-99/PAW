package ar.edu.itba.paw.persistance;

import ar.edu.itba.paw.model.User;

// DAO = Data Access Object
public interface UserDao {

    User getUserById(long id);
}
