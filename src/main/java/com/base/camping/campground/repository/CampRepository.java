package com.base.camping.campground.repository;

import com.base.camping.campground.model.Campgrounds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampRepository extends CrudRepository<Campgrounds, Integer> {

    public Iterable<Campgrounds> getAllCampGrounds();

    public Campgrounds giveOneCampGround(Integer integer);

    public void enterCampGround(Campgrounds campGrounds) ;

    public void deleteCampGround(Campgrounds campgrounds) ;

    public Iterable<Campgrounds> getAllCampWithLocation(String location) ;

    public void enterCampGrounds(List<Campgrounds> campGrounds) ;


}
/**
 * final
 * @return
 * really
 */