package com.artplan.secondTask.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pet_genders")
@Data
@NoArgsConstructor
public class PetGender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_gender_id")
    private Long petGenderId;

    @Column(name = "pet_gender_title")
    private String petGenderTitle;

    @OneToMany(mappedBy ="petGender")
    private List<Pet> pets;

}