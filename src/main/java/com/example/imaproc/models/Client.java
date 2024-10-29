package com.example.imaproc.models;

import org.springframework.data.annotation.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Client{

    public long id;

}