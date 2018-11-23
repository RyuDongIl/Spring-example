package org.snu.practice3.service.impl;

import org.snu.practice3.model.DefaultRes;
import org.snu.practice3.model.User;
import org.snu.practice3.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static final List<User> userList = new LinkedList<>();

    @Override
    public DefaultRes<List<User>> findAll() {
        if(userList.isEmpty()) return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "No User");
        return DefaultRes.res(HttpStatus.OK.value(), "find user success", userList);
    }

    @Override
    public DefaultRes<User> findByUserIdx(int user_idx) {
        for(User u : userList) {
            if(u.getUser_idx() == user_idx) {
                return DefaultRes.res(HttpStatus.OK.value(), "find user success", u);
            }
        }
        return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "Fail to find user");
    }

    @Override
    public DefaultRes save(User user) {
        userList.add(user);
        return DefaultRes.res(HttpStatus.OK.value(), "user save success");
    }

    @Override
    public DefaultRes<User> update(int user_idx, User user) {
        for(User u : userList) {
            if(u.getUser_idx() == user_idx) {
                userList.remove(u);
                userList.add(user);
                return DefaultRes.res(HttpStatus.OK.value(), "update user success");
            }
        }
        return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "Fail to update user");
    }

    @Override
    public DefaultRes deleteByUserIdx(int user_idx) {
        for(User u : userList) {
            if(u.getUser_idx() == user_idx) {
                userList.remove(u);
                return DefaultRes.res(HttpStatus.OK.value(), "delete user success");
            }
        }
        return DefaultRes.res(HttpStatus.NOT_FOUND.value(), "Fail to delete user");
    }
}
