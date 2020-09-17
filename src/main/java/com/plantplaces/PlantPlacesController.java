package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author csros
 *Handle the /start endpoint
 * @return
 */
@Controller
public class PlantPlacesController {
	
	/**
	 *Handle the /start endpoint
	 * @return
	 */
	@RequestMapping("/start")
	public String Start() {
		
		return "start";
	}
	
	/**
	 * Handle the / endpoint
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		
		return "start";
	}
	
}
