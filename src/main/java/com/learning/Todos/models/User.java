package com.learning.Todos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder // In a http we are adding configuration to the user so we can use builder pattern to create user object
@Table(name = "usertable")
public class User {

    @Id
    @GeneratedValue
    Long id;
    @Email
    String email;
    String password;
}
