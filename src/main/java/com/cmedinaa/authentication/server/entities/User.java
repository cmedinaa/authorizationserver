package com.cmedinaa.authentication.server.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user", schema = "auth")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false, length = 64, name = "loginname")
    private String loginName;

    @Column(nullable = false, length = 128)
    private String password;

    @ManyToMany(mappedBy = "users", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private List<Role> roles;

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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
