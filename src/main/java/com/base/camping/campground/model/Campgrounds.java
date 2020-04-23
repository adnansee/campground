package com.base.camping.campground.model;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * final
 * @return
 * really
 */
@Data
@Entity(name = "campgrounds")
public class Campgrounds {

    public Campgrounds() {
    }

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")      //NAME
    private String name;
    @Column(name = "location")  //LOCATION
    private String location;
    @Column(name = "size")      //SIZE
    private int size;
    @Column(name = "people")    //SIZE
    private int people;
    @Column(name = "maxdays")   //MAXDAYS
    private int maxdays;
    @Column(name = "toilet")    //TOILET
    private String toilet;
    @Column(name = "fire")      //FIRE
    private String fire;
    @Column(name = "pic")       //PIC
    private String pic;
    @Column(name = "email")     //EMAIL
    private String email;
    @Column(name = "description")   //DESCRIPTION
    private String description;
    @Column(name = "price")     //PRICE
    private int price;
    @Column(name = "vehicle")   //VEHICLE
    private String vehicle;
    @Column(name = "review")    //REVIEW
    private String review;
}
