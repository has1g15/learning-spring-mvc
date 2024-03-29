package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value="/login", method= RequestMethod.GET)
//    @ResponseBody - printing return to screen
    public String showLoginPage() {
        return "login";
    }

    @RequestMapping(value="/login", method= RequestMethod.POST)
    public String handleLoginRequest(@RequestParam String name,
                                     @RequestParam String password, ModelMap model) {
        if (!loginService.validateUser(name, password)) {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        model.put("name", name);
        model.put("password", password);
        return "welcome";
    }
}
