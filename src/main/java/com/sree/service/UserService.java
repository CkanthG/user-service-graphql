package com.sree.service;

import com.sree.entity.Address;
import com.sree.entity.User;
import com.sree.model.UserInput;
import com.sree.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(UserInput userInput) {
        Address address = new Address();
        address.setCity(userInput.getAddressInput().getCity());
        User user = new User(userInput.getName(), userInput.getEmail(), userInput.getPhoneNumber(), address);
        return userRepository.save(user);
    }
}
