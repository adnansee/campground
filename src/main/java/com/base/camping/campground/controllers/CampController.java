package com.base.camping.campground.controllers;

import com.base.camping.campground.Campgrounds;
import com.base.camping.campground.dbinterface.CampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CampController {

    @Autowired
    CampRepository crep;

    @GetMapping("/showall")
    public List<Campgrounds> showCampGrounds(){
        return crep.findAll();
    }

    @GetMapping("/{id}")
    public Campgrounds giveOneCampGround(@PathVariable("id") Integer integer){
        return crep.findById(integer).get();
    }

    @PostMapping("/addcamp")
    public void enterCampGround(@RequestBody Campgrounds campGrounds){
        crep.save(campGrounds);
    }





}
