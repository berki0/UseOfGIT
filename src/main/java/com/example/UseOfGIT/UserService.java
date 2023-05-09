package com.example.UseOfGIT;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String addNewUser(User user){
        userRepository.save(user);
        return "your user added";
    }
    public List<User> returnListOfUsers(){
        return userRepository.findAll();
    }
}
