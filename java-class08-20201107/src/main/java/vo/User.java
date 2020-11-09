/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package vo;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private Long id;

    private String name;

    private Integer age;

    private List<UserContact> userContacts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<UserContact> getUserContacts() {
        return userContacts;
    }

    public void setUserContacts(List<UserContact> userContacts) {
        this.userContacts = userContacts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", userContacts=" + userContacts +
                '}';
    }
}
