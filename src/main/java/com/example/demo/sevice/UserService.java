package com.example.demo.sevice;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper usermapper;

    public User findUserById(int userId){
        return usermapper.selectById(userId);
    }

}
