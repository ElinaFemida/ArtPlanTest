package com.artplan.secondTask.controllers;

import com.artplan.secondTask.dtos.UserDto;
import com.artplan.secondTask.exceptions.ResourceNotFoundException;
import com.artplan.secondTask.model.User;
import com.artplan.secondTask.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/me")
    public UserDto getCurrentUsername(Principal principal) {
        User currentUser = userService.findByUsername(principal.getName()).orElseThrow(() -> new ResourceNotFoundException("User doesn't exist"));
        return new UserDto(currentUser.getUsername());
    }
}
