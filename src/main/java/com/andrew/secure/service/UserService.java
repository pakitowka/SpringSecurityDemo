package com.andrew.secure.service;


import com.andrew.secure.entity.User;

public interface UserService {
    User getUser(String login);
}

