package challenge.service;

import java.util.List;

import challenge.domain.User;


public interface UserService {
    List<User> list(int pageNo, int pageSize);
    User get(String mail);
    boolean isExist(String mail, String password);
    int add(User user);
    int update(User user);
    int delete(String mail);
}
