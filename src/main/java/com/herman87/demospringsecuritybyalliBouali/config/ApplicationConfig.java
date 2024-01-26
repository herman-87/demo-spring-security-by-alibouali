package com.herman87.demospringsecuritybyalliBouali.config;

import com.herman87.demospringsecuritybyalliBouali.user.UserSpringRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    private final UserSpringRepository userSpringRepository;

    @Bean
    public UserDetailsService userDetailsService() {
        return username -> userSpringRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
