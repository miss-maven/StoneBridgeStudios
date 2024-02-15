package com.stonebridge.loremaster.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public static boolean validateUser(String userid, String password) {
        return userid.equalsIgnoreCase("admin")
                && password.equalsIgnoreCase("password");
    }

}