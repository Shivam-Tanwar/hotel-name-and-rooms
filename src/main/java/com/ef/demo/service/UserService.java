package com.ef.demo.service;

import java.util.List;

import com.ef.demo.model.User;

public interface UserService {
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);
}
