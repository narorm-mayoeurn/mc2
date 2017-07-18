package edu.mum.ea.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by darith on 7/17/17.
 */

@Entity(name = "credientials")
public class UserCredential implements Serializable {

    @Id
    @Column(name = "username", length = 40, nullable = false, unique = true)
    private String username;

    @Column(name = "password", length = 255, nullable = false)
    private String password;

    @OneToOne(mappedBy = "userCredential", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
