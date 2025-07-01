package com.fitness.userservice.service;

import com.fitness.userservice.Dto.RegisterRequest;
import com.fitness.userservice.Dto.UserResponse;
import com.fitness.userservice.models.User;
import com.fitness.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public UserResponse register(RegisterRequest request) {

        if (userRepository.existsByEmail(request.getEmail())){
            throw new RuntimeException("Email already exist");
        }

        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());

        User savedUSer = userRepository.save(user);
        UserResponse userResponse = new UserResponse();
        userResponse.setId(savedUSer.getId());
        userResponse.setPassword(savedUSer.getPassword());
        userResponse.setEmail(savedUSer.getEmail());
        userResponse.setFirstName(savedUSer.getFirstName());
        userResponse.setLastName(savedUSer.getLastName());
        userResponse.setCreatedAt(savedUSer.getCreatedAt());
        userResponse.setUpdatedAt(savedUSer.getUpdatedAt());

        return userResponse;
    }

    public UserResponse getUserProfile(String userId) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setPassword(user.getPassword());
        userResponse.setEmail(user.getEmail());
        userResponse.setFirstName(user.getFirstName());
        userResponse.setLastName(user.getLastName());
        userResponse.setCreatedAt(user.getCreatedAt());
        userResponse.setUpdatedAt(user.getUpdatedAt());

        return userResponse;


    }

    public Boolean existsByUserId(String userId) {
        log.info("Calling user Validation API for user id {}", userId);
        return userRepository.existsById(userId);

    }
}
