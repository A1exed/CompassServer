package com.pashin.CompassServer.entity;

import javax.persistence.*;
import java.io.Serializable;

@SequenceGenerator(name = "seq", sequenceName = "seq", allocationSize = 1)
@Entity
@Table(name = "user", catalog = "compass", schema = "public")
public class User implements Serializable {

    @Id
    @GeneratedValue(generator = "seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username", length = 20, nullable = false)
    private String username;

    @Column(name = "password", length = 20, nullable = false)
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
