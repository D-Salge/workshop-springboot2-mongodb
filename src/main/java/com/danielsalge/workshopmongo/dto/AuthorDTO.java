package com.danielsalge.workshopmongo.dto;

import com.danielsalge.workshopmongo.domain.User;

import java.io.Serializable;

public class AuthorDTO implements Serializable{

    private String id;
    private String name;

    public AuthorDTO() {
    }

    public AuthorDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
