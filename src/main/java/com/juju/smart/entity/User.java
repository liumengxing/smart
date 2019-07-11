package com.juju.smart.entity;

/**
 * @author juju
 * @date 2019/06/27
 */
public class User {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("id = %s, name = %s", id, name);
    }
}
