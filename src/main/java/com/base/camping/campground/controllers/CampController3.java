package com.base.camping.campground.controllers;

import com.base.camping.campground.model.Campgrounds;
import com.base.camping.campground.services.CampGroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 * LATEST CONTROLLER
 */

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class CampController3 {


    @Autowired
    CampGroundService campGroundService;


    //GETALL FOR GET THE LIST IN A RESPONSE ENTITY  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    private ResponseEntity<List<Campgrounds>> getListResponseEntity(List<Campgrounds> campgrounds) {
        if (campgrounds.isEmpty()) {
            return new ResponseEntity<List<Campgrounds>>(HttpStatus.NO_CONTENT);
        } else {
            System.out.println("Found " + campgrounds.size() + " Campgrounds");
            System.out.println(Arrays.toString(campgrounds.toArray()));
            return new ResponseEntity<List<Campgrounds>>(campgrounds, HttpStatus.OK);
        }
    }


//ADMIN GET ALL ONLY
    @RequestMapping(method = RequestMethod.GET, value = "/admin/getall")
    public ResponseEntity<List<Campgrounds>> getAllCampGroundsAdmin() {
        List<Campgrounds> campgrounds = (List<Campgrounds>) campGroundService.getAllCampGrounds();
        if (campgrounds.isEmpty()) {
            return new ResponseEntity<List<Campgrounds>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Campgrounds>>(campgrounds, HttpStatus.OK);
    }



    /**
     * DELETE CAMP
     */
    @RequestMapping(value = "/admin/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteCampGround(@PathVariable("id") int id) {
        Campgrounds campgrounds = campGroundService.giveOneCampGround(id);
        if (campgrounds == null) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        } else {
            campGroundService.deleteCampGround(campgrounds);
            return new ResponseEntity<Void>(HttpStatus.GONE);
        }
    }

    /**
     * ADD CAMP
     */
    @RequestMapping(method = RequestMethod.POST, value = "/admin/addit")
    @PostMapping
    public ResponseEntity<Campgrounds> addCampGround(@RequestBody Campgrounds campgrounds) {
        campGroundService.enterCampGround(campgrounds);
        System.out.println("getting called");
        return new ResponseEntity<Campgrounds>(campgrounds, HttpStatus.CREATED);

    }

    /**
     * SEARCH BY ID
     */

    @RequestMapping(value = "/search/giveone/{id}", method = RequestMethod.GET)
    public ResponseEntity<Campgrounds> getCampGround(@PathVariable("id") int id) {
        Campgrounds campgrounds = campGroundService.giveOneCampGround(id);
        if (campgrounds == null) {
            return new ResponseEntity<Campgrounds>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Campgrounds>(campgrounds, HttpStatus.OK);
    }

    /**
     * GETALL
     */

    @RequestMapping(method = RequestMethod.GET, value = "/getall")
    public ResponseEntity<List<Campgrounds>> getAllCampGrounds() {
        List<Campgrounds> campgrounds = (List<Campgrounds>) campGroundService.getAllCampGrounds();
        if (campgrounds.isEmpty()) {
            return new ResponseEntity<List<Campgrounds>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Campgrounds>>(campgrounds, HttpStatus.OK);
    }

    /*
     * SEARCH ALL
     * */
    @RequestMapping(method = RequestMethod.POST, value = "/admin/addall")
    @PostMapping
    public ResponseEntity<List<Campgrounds>> addCampGrounds(@RequestBody List<Campgrounds> campgrounds) {
        campGroundService.enterCampGrounds(campgrounds);
        return new ResponseEntity<List<Campgrounds>>(campgrounds, HttpStatus.CREATED);
    }

    /**
     * SEARCH BY LOCATION
     */

    @RequestMapping(method = RequestMethod.GET, value = "/search/getall/{location}")
    public ResponseEntity<List<Campgrounds>> getAllWithLocation(@PathVariable("location") String location) {
        List<Campgrounds> campgrounds = (List<Campgrounds>) campGroundService.findByLocationCampGrounds(location);
        return getListResponseEntity(campgrounds);
    }

    /**
     * SEARCH BY AREA
     */
    @RequestMapping(method = RequestMethod.GET, value = "/search/getsize/{size}")
    public ResponseEntity<List<Campgrounds>> getAllWithSize(@PathVariable("size") int size) {
        List<Campgrounds> campgrounds = (List<Campgrounds>) campGroundService.findBySize(size);
        return getListResponseEntity(campgrounds);
    }

    //        SEARCH BY PEOPLE SIZE
    @RequestMapping(method = RequestMethod.GET, value = "/search/getpeople/{size}")
    public ResponseEntity<List<Campgrounds>> getAllWithPeopleSize(@PathVariable("size") int size) {
        List<Campgrounds> campgrounds = (List<Campgrounds>) campGroundService.findByPeopleSize(size);
        return getListResponseEntity(campgrounds);
    }

    //SEARCH BY PRICE
    @RequestMapping(method = RequestMethod.GET, value = "/search/getprice/{price}")
    public ResponseEntity<List<Campgrounds>> getAllByPrice(@PathVariable("price") int price) {
        List<Campgrounds> campgrounds = (List<Campgrounds>) campGroundService.findByPrice(price);
        return getListResponseEntity(campgrounds);
    }




    //SEARCH BY DAYS
    @RequestMapping(method = RequestMethod.GET, value = "/search/getdays/{days}")
    public ResponseEntity<List<Campgrounds>> getAllByMaxdays(@PathVariable("days") int days) {
        List<Campgrounds> campgrounds = (List<Campgrounds>) campGroundService.findByMaxdays(days);
        return getListResponseEntity(campgrounds);
    }

    //SEARCH BY PRICE RANGE
    @RequestMapping(method = RequestMethod.GET, value = "/search/getprice/range/{largePrice}/{smallPrice}")
    public ResponseEntity<List<Campgrounds>> getAllByPriceRange(@PathVariable("largePrice") int largePrice, @PathVariable("smallPrice") int smallPrice) {
        List<Campgrounds> campgrounds = (List<Campgrounds>) campGroundService.findBetweenPrice(largePrice,smallPrice);
        return getListResponseEntity(campgrounds);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/search/getsize/range/{largeSize}/{smallSize}")
    public ResponseEntity<List<Campgrounds>> getAllBySizeRange(@PathVariable("largeSize") int largeSize, @PathVariable("smallSize") int smallSize) {
        List<Campgrounds> campgrounds = (List<Campgrounds>) campGroundService.findBetweenSize(largeSize,smallSize);
        return getListResponseEntity(campgrounds);
    }


    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public ModelAndView method() {
        return new ModelAndView("redirect:" + "https://camperb.herokuapp.com/home2.html");
    }


}
