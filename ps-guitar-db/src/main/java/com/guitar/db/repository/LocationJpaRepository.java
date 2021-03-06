package com.guitar.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guitar.db.model.Location;

@Repository
public interface LocationJpaRepository extends JpaRepository<Location, Long>{
	//List<Location> findByStateLike(String stateName);
	List<Location> findByStateIgnoreCaseStartingWith(String stateName);
	
	Location findFirstByStateIgnoreCaseStartingWith(String stateName);

	List<Location> findByStateNotLikeOrderByStateAsc(String stateName);

	List<Location> findByStateIsOrCountryEquals(String stateName, String countryName);
	
	List<Location> findByStateAndCountry(String stateName, String countryName);
	
	List<Location> findByStateNot(String stateName);
	
}
