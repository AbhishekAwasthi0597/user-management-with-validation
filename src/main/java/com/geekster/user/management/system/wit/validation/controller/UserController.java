package com.geekster.user.management.system.wit.validation.controller;

import com.geekster.user.management.system.wit.validation.model.UserModel;
import com.geekster.user.management.system.wit.validation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public String addUser(@Valid @RequestBody UserModel ums){
        userService.userAdd(ums);
        return "user has been added";
    }
    @GetMapping("/getUser/{id}")
    public UserModel getUserByid(@PathVariable Integer id){
        return userService.getUmsbyId(id);
    }
    @GetMapping("/getAllUser")
    public List<UserModel> getAllUser(){
        return userService.getUserAtService();
    }
    @PutMapping("/update-user/{id}")
    public  UserModel updateUser(@PathVariable int id,@Valid @RequestBody UserModel ums){
        return  userService.updateUser(id,ums);
    }
    @DeleteMapping("/delete-user")
    public  String deleteUser(@RequestParam int id){
        UserModel ums=userService.deleteUser(id);
        return "user deleted with Id "+id+"with data"+ums.toString();
    }
}
