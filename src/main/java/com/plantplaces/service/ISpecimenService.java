package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;



/**
 * CRUD operations for specimen
 */
public interface ISpecimenService {
	/**
	 * get specimens from persistence layer
	 * @param id a unique lookup
	 * @return a specimen with a matching id
	 */
	
	SpecimenDTO fetchById(int id);
	/**
	 * persist the given DTO
	 * @param specimenDTO
	 */

	void save(SpecimenDTO specimen);

}