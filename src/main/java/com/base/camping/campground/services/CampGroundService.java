package com.base.camping.campground.services;

import com.base.camping.campground.model.Campgrounds;
import com.base.camping.campground.repository.CampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampGroundService {

    @Autowired
    CampRepository crep;


    public Iterable<Campgrounds> getAllCampGrounds() {
        return crep.findAll();
    }

    public Campgrounds giveOneCampGround(Integer integer) {
        return crep.findById(integer).get();
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
