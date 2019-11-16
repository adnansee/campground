package com.base.camping.campground.dbinterface;

import com.base.camping.campground.Campgrounds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampRepository extends JpaRepository<Campgrounds, Integer> {
}
