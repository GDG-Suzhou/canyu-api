package fun.canyu.api.controller;

import fun.canyu.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/signup")
    public String signUp(String username, String password) {
        userService.signUp(username, password);
        return "注册成功";
    }

    @GetMapping("/login")
    public String login(String username, String password) {
        boolean result = userService.login(username, password);
        if (result) {
            return "登陆成功";
        } else {
            return "登陆失败";
        }
    }
}
