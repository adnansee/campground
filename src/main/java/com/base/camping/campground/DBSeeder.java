package com.base.camping.campground;

import com.base.camping.campground.model.Campgrounds;
import com.base.camping.campground.repository.CampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {

    @Autowired
    private CampRepository campRepository;

    /**
     * This class simply enters some data via command line to test
     **/

    @Override
    public void run(String... args) {

        Campgrounds c = new Campgrounds();
        c.setDescription("NICE");
        c.setEmail("X@X");
        c.setFire("YES");
        c.setLocation("X-cord, Y-cord");
        c.setMaxdays(3);
        c.setName("HAPPY VALLY");
        c.setPeople(3);
        c.setPic("https://picsum.photos/200/300");
        c.setReview("GREAT");
        c.setSize(50);
        c.setToilet("YES");
        c.setVehicle("YES");
        c.setPrice(20);


        List<Campgrounds> camps = Arrays.asList(c);
        this.campRepository.saveAll(camps);
    }
    }