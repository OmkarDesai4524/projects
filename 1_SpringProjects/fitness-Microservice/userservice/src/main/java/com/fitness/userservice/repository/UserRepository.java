package com.fitness.userservice.repository;

import com.fitness.userservice.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, String> {


    boolean existsByEmail(String email);

    Boolean existsByKeyCloakId(String userId);

    User findByEmail(String email);
}
