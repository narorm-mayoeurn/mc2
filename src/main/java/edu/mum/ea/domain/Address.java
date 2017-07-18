package edu.mum.ea.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by darith on 7/17/17.
 */
@Entity(name = "addresses")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "state", length = 40)
    private String state;

    @Column(name = "city", length = 40)
    private String city;

    @Column(name = "street", length = 100)
    private String street;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
