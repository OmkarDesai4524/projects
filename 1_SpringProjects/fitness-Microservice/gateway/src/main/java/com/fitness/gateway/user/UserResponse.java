package com.fitness.gateway.user;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResponse {

    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    private String keyCloakId;


    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
