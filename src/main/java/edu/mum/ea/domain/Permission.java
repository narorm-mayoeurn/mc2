package edu.mum.ea.domain;

/**
 * Created by darith on 7/17/17.
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "permissions")
public class Permission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "permission", length = 40, nullable = false)
    private String permission;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
