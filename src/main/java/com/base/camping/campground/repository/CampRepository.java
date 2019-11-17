package com.base.camping.campground.repository;

import com.base.camping.campground.model.Campgrounds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampRepository extends CrudRepository<Campgrounds, Integer> {
}
