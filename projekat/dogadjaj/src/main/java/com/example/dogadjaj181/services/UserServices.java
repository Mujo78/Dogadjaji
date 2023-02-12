package com.example.dogadjaj181.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dogadjaj181.models.entities.User;
import com.example.dogadjaj181.models.in.UserIn;
import com.example.dogadjaj181.models.out.UserOut;

@Service
public interface UserServices {
    List<UserOut> getAll();

    UserOut addUser(UserIn userIn);

    public User getUserByEmail(String username);
}
