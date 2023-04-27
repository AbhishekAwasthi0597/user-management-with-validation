package com.geekster.user.management.system.wit.validation.dao;

import com.geekster.user.management.system.wit.validation.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepo {
    List<UserModel> list=new ArrayList<>();
    public void repoAdd(UserModel ums) {
        list.add(ums);
    }

    public UserModel getUserbyId(Integer id) {
        for(UserModel u:list){
            if(u.getUserId()==id){
                return u;
            }
        }
        return null;
    }

    public List<UserModel> getUserAtRepo() {
        return list;
    }

    public UserModel updateUser(int id, UserModel ums) {
        if(getUserbyId(id)!=null){
            UserModel usm=getUserbyId(id);
            ums.setUserName(ums.getUserName());
            ums.setDateOfBirth(ums.getDateOfBirth());
            ums.setEmail(ums.getEmail());
            ums.setNumber(ums.getNumber());
            ums.setDate(ums.getDate());
            ums.setTime(ums.getTime());
            return ums;
        }
        return null;
    }

    public UserModel deleteUser(int id) {
        UserModel ums=getUserbyId(id);
        boolean remove=list.remove(ums);
        if(remove){
            return ums;
        }else{
            return null;
        }
    }
}
