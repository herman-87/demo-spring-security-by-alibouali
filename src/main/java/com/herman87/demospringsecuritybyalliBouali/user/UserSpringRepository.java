package com.herman87.demospringsecuritybyalliBouali.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserSpringRepository extends JpaRepository<User, Long> {
    Optional<UserDetails> findByEmail(String username);
}
