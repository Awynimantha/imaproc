package com.example.imaproc.models;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@RequiredArgsConstructor
@Entity
@Table(name = "client")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public final String firstname;
    public final String lastname;
    public final int age;
    public final String previlage; 
    public final String password;  // Removed final modifier
    
 
}
