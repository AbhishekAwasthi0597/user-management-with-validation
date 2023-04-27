package com.geekster.user.management.system.wit.validation.service;

import com.geekster.user.management.system.wit.validation.dao.UserRepo;
import com.geekster.user.management.system.wit.validation.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    public void userAdd(UserModel ums){
        userRepo.repoAdd(ums);
    }

    public UserModel getUmsbyId(Integer id) {
        return  userRepo.getUserbyId(id);
    }

    public List<UserModel> getUserAtService() {
        return userRepo.getUserAtRepo();
    }

    public UserModel updateUser(int id, UserModel ums) {
        return userRepo.updateUser(id,ums);
    }

    public UserModel deleteUser(int id) {
        return  userRepo.deleteUser(id);
    }
}
