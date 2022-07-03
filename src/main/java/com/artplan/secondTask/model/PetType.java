package com.artplan.secondTask.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pet_types")
@Data
@NoArgsConstructor
public class PetType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_type_id")
    private Long petTypeId;

    @Column(name = "pet_type_title")
    private String petTypeTitle;

    @OneToMany(mappedBy = "petType")
    private List<Pet> pets;

}
