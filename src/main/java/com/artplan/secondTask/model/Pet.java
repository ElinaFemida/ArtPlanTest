package com.artplan.secondTask.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class Pet {

    private String type;
    private Date birthDate;
    private String gender;
    private String petNickname;


}
