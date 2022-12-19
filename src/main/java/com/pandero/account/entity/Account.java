package com.pandero.account.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Account {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Integer id;

    @Column
    String username;

    @Column
    String password;

    @Column
    String email;

    @Column
    String phoneNumber;

    @Column
    Integer accountType;
}
