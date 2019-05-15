package fun.canyu.api.service;

public interface UserService {
    boolean login(String username, String password);

    boolean signUp(String username, String password);
}
