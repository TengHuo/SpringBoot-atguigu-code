package teng.spring06datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import teng.spring06datajpa.entity.User;
import teng.spring06datajpa.repository.UserRepository;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable(name = "id") Integer id) {
        return userRepository.findById(id);
    }

    @GetMapping("/user")
    public User insertUser(User newUser) {
        return userRepository.save(newUser);
    }
}
