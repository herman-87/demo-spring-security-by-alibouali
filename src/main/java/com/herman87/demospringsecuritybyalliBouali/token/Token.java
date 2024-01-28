package com.herman87.demospringsecuritybyalliBouali.token;

import com.herman87.demospringsecuritybyalliBouali.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String token;
    private TokenType type;
    private boolean expired;
    private boolean revoked;
    @ManyToOne
    @JoinColumn(name = "c_user_id")
    private User user;
}
