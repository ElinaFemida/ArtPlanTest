package com.artplan.secondTask.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private long userId;
    private String userName;
    private String password;
}
