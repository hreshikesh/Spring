package com.xworkz.module.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@NamedQuery(name="getSignUpDetails",query = "select e from RegisterEntity e where name=:nameBy")
@NamedQuery(name="checkEmail",query = "select e from RegisterEntity e where email=:emailBy")
@NamedQuery(name = "countEmail",query = "select count(e.email) from RegisterEntity e where email=:email")
@NamedQuery(name = "fetchPassword",query = "select e.password from RegisterEntity e")

public class RegisterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private Long phone;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "password")
    private String password;

    @Column(name="login_attempt")
    private int loginAttempt=0;

    @Column(name="local_date_time")
    private LocalDateTime localDateTime;

}
