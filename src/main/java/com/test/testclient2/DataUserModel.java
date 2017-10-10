package com.test.testclient2;


import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity class for User Data
 */

@Entity
@Table(name="UserData")
public class DataUserModel {

    @Id
    @GeneratedValue
    @Column(name="Id")
    private long userId;
    @Column(name="userName")
    private String username;
    @Column(name="ProjectName")
    @Value("${projectName}")
    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


}
