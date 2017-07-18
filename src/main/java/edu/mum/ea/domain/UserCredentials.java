package edu.mum.ea.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by darith on 7/17/17.
 */

@SuppressWarnings("serial")
@Entity(name = "Authentication")
public class UserCredentials implements Serializable {

    @Id
    @Column(name = "username", length = 40, nullable = false, unique = true)
    private String userName;

    @Column(name = "password", length = 255, nullable = false)
    private String password;

    @OneToOne(mappedBy = "userCredentials", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private User user;

    public String getUserName() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
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
