package com.juju.entity;

import java.util.List;

/**
 * @author juju
 * @date 2019/06/27
 */
public class User {
    private long id;
    private long name;
    private List<String> characters;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }
}
