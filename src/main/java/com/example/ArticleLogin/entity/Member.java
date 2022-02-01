package com.example.ArticleLogin.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotEmpty
    private String userid;

    @Column
    @NotEmpty
    private String password;

    @Column
    @NotEmpty
    private String username;

    @Column
    @NotEmpty
    private String nickname;

    @Column
    @NotEmpty
    private String email;

    @Column
    @Enumerated(EnumType.STRING)
    private UserRole role;


}
