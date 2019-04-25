package com.danieldev.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danieldev.api.model.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
