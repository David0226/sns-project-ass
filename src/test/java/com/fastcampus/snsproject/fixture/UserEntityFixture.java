package com.fastcampus.snsproject.fixture;

import com.fastcampus.snsproject.model.entity.UserEntity;
import org.junit.jupiter.api.BeforeEach;

public class UserEntityFixture {


    public static UserEntity get(String userName, String password){
        UserEntity result = new UserEntity();
        result.setId(1);
        result.setUserName(userName);
        result.setPassword(password);
        return result;

    }
}
