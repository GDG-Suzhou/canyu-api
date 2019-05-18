package fun.canyu.api.service;

import com.google.common.collect.ImmutableSet;
import fun.canyu.api.model.Role;
import fun.canyu.api.model.User;
import fun.canyu.api.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authenticationManager;

    public boolean login(String username, String password) {

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public boolean signUp(String username, String password) {
        User user = new User()
                .setUsername(username)
                .setPassword(passwordEncoder.encode(password))
                .setRoles(ImmutableSet.of(Role.ROLE_NORMAL_USER));
        userRepository.insert(user);
        return true;
    }
}
