package service;

import Model.User;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
}