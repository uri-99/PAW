package ar.edu.itba.paw.persistence;

import ar.edu.itba.paw.persistance.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcDao implements UserDao {

    @Override
    public String getUsername() {
        return "PAW from the db";
    }
}
