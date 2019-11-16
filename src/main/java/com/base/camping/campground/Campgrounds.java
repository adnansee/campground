package com.base.camping.campground;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Campgrounds {

    public Campgrounds() {
    }

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "size")
    private int size;
    @Column(name = "people")
    private int people;
    @Column(name = "maxdays")
    private int maxdays;
    @Column(name = "toilet")
    private String toilet;
    @Column(name = "fire")
    private String fire;
    @Column(name = "pic")
    private String pic;
    @Column(name = "email")
    private String email;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private int price;
    @Column(name = "vehicle")
    private String vehicle;
    @Column(name = "review")
    private String review;
}
