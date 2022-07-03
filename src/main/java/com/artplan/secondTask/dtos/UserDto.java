package com.artplan.secondTask.dtos;


import lombok.Data;

@Data
public class UserDto {
    private String userName;

    public UserDto(String username) {
        this.userName = username;
    }
}