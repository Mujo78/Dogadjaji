package com.example.dogadjaj181.services.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.dogadjaj181.models.entities.User;
import com.example.dogadjaj181.models.in.UserIn;
import com.example.dogadjaj181.models.out.UserOut;
import com.example.dogadjaj181.repository.UserRepository;
import com.example.dogadjaj181.services.UserServices;

@Service
public class UserServicesImplementation implements UserServices {

    @Autowired
    private UserRepository _UserRepository;

    @Autowired  
    private PasswordEncoder _SifraEncode;

    @Override
    public List<UserOut> getAll() {
        
        List<User> useri = _UserRepository.findAll();
        List<UserOut> usersOut = new ArrayList<>();

        for(User users : useri){
            usersOut.add(new UserOut(users));
        }
        return usersOut;
    }

    @Override
    public UserOut addUser(UserIn userIn) {
        User user = new User(userIn);
        if(user.getEmail().isEmpty() || user.getSifra().isEmpty()){
            return null;
        }else{
        user.setSifra(_SifraEncode.encode(user.getSifra()));
        _UserRepository.save(user);
        return new UserOut(user);
    }
}
    public User getUserByEmail(String username) {
        return _UserRepository.findByEmail(username);
    }
}
