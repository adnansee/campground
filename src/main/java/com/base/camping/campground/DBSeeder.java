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

        Campgrounds campground1 = new Campgrounds();
        campground1.setDescription("NICE");
        campground1.setEmail("X@X");
        campground1.setFire("YES");
        campground1.setLocation("X-cord, Y-cord");
        campground1.setMaxdays(3);
        campground1.setName("HAPPY VALLY");
        campground1.setPeople(3);
        campground1.setPic("https://picsum.photos/200/300");
        campground1.setReview("GREAT");
        campground1.setSize(50);
        campground1.setToilet("YES");
        campground1.setVehicle("YES");
        campground1.setPrice(20);


        Campgrounds campground2 = new Campgrounds();
        campground2.setDescription("LOVELY");
        campground2.setEmail("Y@Y");
        campground2.setFire("NO");
        campground2.setLocation("X-cord, Y-cord");
        campground2.setMaxdays(5);
        campground2.setName("RIDGE VIEW");
        campground2.setPeople(2);
        campground2.setPic("https://picsum.photos/200/300");
        campground2.setReview("AWESOME");
        campground2.setSize(30);
        campground2.setToilet("NO");
        campground2.setVehicle("YES");
        campground2.setPrice(35);


        List<Campgrounds> camps = Arrays.asList(campground1, campground2);
        this.campRepository.saveAll(camps);
    }
    }