package fun.canyu.api.service.impl;

import fun.canyu.api.model.User;
import fun.canyu.api.repository.UserRepository;
import fun.canyu.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean login(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        return user != null;
    }

    @Override
    public boolean signUp(String username, String password) {
        User user = new User().setUsername(username).setPassword(password);
        userRepository.insert(user);
        return true;
    }
}
