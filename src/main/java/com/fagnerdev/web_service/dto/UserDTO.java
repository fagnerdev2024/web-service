package com.fagnerdev.web_service.dto;

import com.fagnerdev.web_service.entities.User;



public record UserDTO(Long id, String name, String email, String phone) {

    public UserDTO(User user) {
        this(user.getId(), user.getName(), user.getEmail(), user.getPhone());
    }
}

