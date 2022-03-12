package uz.ibrokhimoff.services.auth;

import org.springframework.stereotype.Service;
import uz.ibrokhimoff.dao.AuthUserDao;
import uz.ibrokhimoff.models.Login;

import java.util.List;


@Service
public class LoginService {

    private final AuthUserDao authUserDao;

    public LoginService(AuthUserDao authUserDao) {
        this.authUserDao = authUserDao;
    }

    public List<Login> getAll() {
        return authUserDao.getAll();
    }

    public Boolean checkUser(Login login) {
        List<Login> users = getAll();
        for (Login user : users) {
            if(user.getUsername().equals(login.getUsername())&&user.getPassword().equals(login.getPassword())
            &&user.getRole().equals("admin")){
                return true;
            }
        }
        return false;
    }
}
