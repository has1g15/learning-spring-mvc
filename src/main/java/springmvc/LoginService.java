package springmvc;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean validateUser(String user, String password) {
        return user.equals("Hannah") && password.equals("password");
    }
}
