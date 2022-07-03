package com.artplan.secondTask.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "roles")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_id")
    private Long userRoleId;

    @Column(name = "user_role_title")
    private String userRoleTitle;

}
