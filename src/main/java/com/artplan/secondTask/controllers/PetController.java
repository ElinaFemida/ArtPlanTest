package com.artplan.secondTask.controllers;

import com.artplan.secondTask.model.Pet;
import com.artplan.secondTask.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PetController {
    private final PetService petService;

    @GetMapping("/v1/pets")
    public List<Pet> getAllPets() {
        return petService.findAll();
    }

    @GetMapping("/v1/pets/{id}")
    public Pet getPetById(@PathVariable Long id) {
        return petService.findOneById(id).get();
    }

    @PostMapping(value = "/v1/pets")
    @ResponseStatus (HttpStatus.CREATED)
    public Pet addPet(@RequestBody Pet pet) {
        return petService.addPet(pet);
    }

    @DeleteMapping(value = "/v1/pets/{id}")
    public void deletePet(@RequestBody Pet pet) {
        petService.deletePet(pet);
    }
}
