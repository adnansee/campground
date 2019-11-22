package com.base.camping.campground.services;

import com.base.camping.campground.model.Campgrounds;
import com.base.camping.campground.repository.CampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CampGroundService {

    @Autowired
    CampRepository crep;


    public Iterable<Campgrounds> getAllCampGrounds() {
        return crep.findAll();
    }

    public List<Campgrounds> giveOneCampGround(Integer integer) {
        Campgrounds onecamp = crep.findById(integer).get();
        List<Campgrounds> campgrounds = new ArrayList<>();
        campgrounds.add(onecamp);
        return campgrounds;
    }

    public void enterCampGround(Campgrounds campGrounds) {
        crep.save(campGrounds);
    }

    public void deleteCampGround(Campgrounds campgrounds) {
        crep.delete(campgrounds);
    }

    public Iterable<Campgrounds> getAllCampWithLocation(String location) {crep.findAll();
        return null;
    }

    /**
     * SEARCH BY AREA
     * SEARCH BY PRICE
     *
     *
     */


}
