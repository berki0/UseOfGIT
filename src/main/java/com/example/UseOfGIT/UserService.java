package com.example.UseOfGIT;

import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public Object[] returnListOfUsers(){
        return userRepository.findAll().toArray();
    }
    public Optional<User> returnUserfromID(User user){
       return userRepository.findById(user.getId());
    }
}
