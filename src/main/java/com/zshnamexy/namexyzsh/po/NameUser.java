package com.zshnamexy.namexyzsh.po;
import io.swagger.annotations.Api;
import org.omg.CORBA.INTERNAL;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;


/**
 *
 */
@Api(value = "实体类")

public class NameUser implements Serializable {
    private Integer id ;
    private String name;
    private String nameUser;

    public NameUser() {
    }

    public NameUser(Integer id, String name, String nameUser) {
        this.id = id;
        this.name = name;
        this.nameUser = nameUser;
    }

    @Override
    public String toString() {
        return "NameUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nameUser='" + nameUser + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
}
