package com.herman87.demospringsecuritybyalliBouali.token;

import com.herman87.demospringsecuritybyalliBouali.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Token {

    @Id
    @GeneratedValue
    private Long id;
    private String token;
    @Enumerated(EnumType.STRING)
    private TokenType type;
    private boolean expired;
    private boolean revoked;
    @ManyToOne
    @JoinColumn(name = "c_user_id")
    private User user;
}
