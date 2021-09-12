package com.alexandre.citiesapi.countries.repository;

import com.alexandre.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
