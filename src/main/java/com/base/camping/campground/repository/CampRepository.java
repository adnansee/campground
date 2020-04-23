package com.base.camping.campground.repository;

import com.base.camping.campground.model.Campgrounds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampRepository extends JpaRepository<Campgrounds, Integer> {

    public List<Campgrounds> findCampGroundsByLocation(String location);

    public List<Campgrounds> findCampGroundsByName(String name);

    public List<Campgrounds> findCampGroundBySize(int size);

    public List<Campgrounds> findCampGroundByPeople(int size);

    public List<Campgrounds> findCampGroundByPrice(int price);

    public List<Campgrounds> findCampGroundByMaxdays(int days);

    public List<Campgrounds> findCampGroundByPriceBetween(int priceLarger, int priceSmaller);

    public List<Campgrounds> findCampGroundsBySizeBetween(int sizeBigger, int sizeSmaller);

    public List<Campgrounds> findCampGroundBySizeBetween(int sizeBigger, int sizeSmaller);


}
/**
 * final
 * @return
 * really
 */