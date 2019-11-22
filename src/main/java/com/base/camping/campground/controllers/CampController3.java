package com.base.camping.campground.controllers;

import com.base.camping.campground.model.Campgrounds;
import com.base.camping.campground.services.CampGroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * LATEST CONTROLLER
 */


@RestController
@RequestMapping("/")
public class CampController3 {



    @Autowired
    CampGroundService campGroundService;


    @RequestMapping(value = "/delc/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteCampGround(@PathVariable("id") int id) {
        Campgrounds campgrounds = campGroundService.giveOneCampGround(id);
        if (campgrounds == null) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else {
            campGroundService.deleteCampGround(campgrounds);
            return new ResponseEntity<Void>(HttpStatus.GONE);
        }
    }

    @RequestMapping(method = RequestMethod.POST,  value = "/addit")
    @PostMapping
    public ResponseEntity<Campgrounds> addCampGround(@RequestBody Campgrounds campgrounds) {
        campGroundService.enterCampGround(campgrounds);
        return new ResponseEntity<Campgrounds>(campgrounds, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/giveone/{id}", method = RequestMethod.GET)
    public ResponseEntity<Campgrounds> getCampGround(@PathVariable("id") int id) {
        Campgrounds campgrounds = campGroundService.giveOneCampGround(id);
        if (campgrounds == null) {
            return new ResponseEntity<Campgrounds>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Campgrounds>(campgrounds, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getall")
    public ResponseEntity<List<Campgrounds>> getAllCampGrounds() {
        List<Campgrounds> campgrounds = (List<Campgrounds>) campGroundService.getAllCampGrounds();
        if (campgrounds.isEmpty()) {
            return new ResponseEntity<List<Campgrounds>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Campgrounds>>(campgrounds, HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.POST,  value = "/addall")
    @PostMapping
    public ResponseEntity<Campgrounds> addCampGrounds(@RequestBody List<Campgrounds> campgrounds) {
        campGroundService.enterCampGrounds(campgrounds);
        return new ResponseEntity<Campgrounds>(campgrounds, HttpStatus.CREATED);
    }



    /**
     * SEARCH BY AREA
     *
     */

    /*@RequestMapping(method = RequestMethod.GET, value = "getall")
    public ResponseEntity<List<Campgrounds>> getAllWithLocation(@PathVariable("location") String location) {
        List<Campgrounds> campgrounds = (List<Campgrounds>) campGroundService.getAllCampWithLocation(location);
        if (campgrounds.isEmpty()) {
            return new ResponseEntity<List<Campgrounds>>(HttpStatus.NO_CONTENT);
        }
        System.out.println("Found " + campgrounds.size() + " Campgrounds");
        System.out.println(Arrays.toString(campgrounds.toArray()));
        return new ResponseEntity<List<Campgrounds>>(campgrounds, HttpStatus.OK);
    }*/



}
