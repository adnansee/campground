package com.base.camping.campground.services;

import com.base.camping.campground.model.Campgrounds;
import com.base.camping.campground.repository.CampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Iterable<Campgrounds> getAllCampWithLocation(String location) {
        return crep.findAll();
    }

    public void enterCampGrounds(List<Campgrounds> campGrounds) {
        crep.saveAll(campGrounds);
    }

    public List<Campgrounds> findByLocationCampGrounds(String location) {
        return crep.findCampGroundsByLocation(location);
    }

    public List<Campgrounds> findBySize(int size) {
        return  crep.findCampGroundBySize(size);
    }


    public List<Campgrounds> findByPeopleSize(int size) {
        return crep.findCampGroundByPeople(size);
    }

    public List<Campgrounds> findByPrice(int price) {
        return crep.findCampGroundByPrice(price);
    }

    public List<Campgrounds> findByMaxdays(int days) {
    return crep.findCampGroundByMaxdays(days);
    }

    public List<Campgrounds> findBetweenPrice(int priceLarger, int priceSmaller){
return crep.findCampGroundByPriceBetween(priceLarger, priceSmaller);


    }
    public List<Campgrounds> findBetweenSize(int sizeBigger, int sizeSmaller){
        return crep.findCampGroundBySizeBetween(sizeBigger, sizeSmaller);

}
}
