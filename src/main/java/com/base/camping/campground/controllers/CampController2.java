package com.base.camping.campground.controllers;

import com.base.camping.campground.model.Campgrounds;
import com.base.camping.campground.services.CampGroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * final
 * @return
 * really
 */
//@RestController
//@RequestMapping("/")
public class CampController2 {
/*
    @Autowired
    CampGroundService campGroundService;

    @GetMapping("/getall")
    public List<Campgrounds> getAllCampGrounds(){
        return (List<Campgrounds>) campGroundService.getAllCampGrounds();
    }

    @GetMapping("/{id}")
    public Campgrounds giveOneCampGround(@PathVariable("id") Integer integer){
        return campGroundService.giveOneCampGround(integer);
    }

    @PostMapping("/addcamp")
    public void enterCampGround(@RequestBody Campgrounds campGrounds){
        campGroundService.enterCampGround(campGrounds);
    }
    @GetMapping("/del/{id}")
    public void deleteCampGround(@PathVariable("id") Integer integer) {
         campGroundService.deleteCampGround(giveOneCampGround(integer));
    }*/

}
