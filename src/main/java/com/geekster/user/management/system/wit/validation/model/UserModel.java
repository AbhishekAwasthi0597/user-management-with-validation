package com.geekster.user.management.system.wit.validation.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    @NotNull
    private  int userId;
    @NotNull(message= "userName should not be empty")
    private String userName;
    @Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}",message = "formate of date 01-10-2000")
    private  String dateOfBirth;
    @Size(min=10,max=12,message = "size should between 10 and 12")
    private  String number;
    @Email(message = "mail should not be empty")
    private String email;
    private String date;
    private String time;
}
