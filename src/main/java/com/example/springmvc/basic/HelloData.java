package com.example.springmvc.basic;

import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class HelloData {
    private String username;
    private int age;
}
