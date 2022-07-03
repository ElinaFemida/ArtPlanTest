package com.artplan.secondTask.service;

import com.artplan.secondTask.model.Pet;
import com.artplan.secondTask.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository petRepository;

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public Optional<Pet> findOneById(Long id) {
        return petRepository.findById(id);
    }

    public Pet addPet(Pet pet) {
        return petRepository.save(pet);
    }

    public void deletePet(Pet pet) {
        petRepository.deleteById(pet.getPetId());
    }


}
