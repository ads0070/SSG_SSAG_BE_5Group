package com.ssg.ssg_be.login.domain;

import com.ssg.ssg_be.signup.domain.User;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Token {

    @Id
    @OneToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @Column(nullable = false)
    private String accessToken;

    @Column(nullable = false)
    private String refreshToken;
}