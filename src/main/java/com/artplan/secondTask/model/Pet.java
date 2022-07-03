package com.artplan.secondTask.model;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@NoArgsConstructor
@Entity
@Table(name = "pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "pet_id")
    private long petId;

    @ManyToOne
    @JoinColumn(name = "pet_type_id")
    private PetType petType;

    @Column (name = "pet_birth_date")
    private Date petBirthDate;

    @ManyToOne
    @JoinColumn (name = "pet_gender_id")
    private PetGender petGender;

    @Column (name = "pet_nickname")
    private String petNickname;


}
