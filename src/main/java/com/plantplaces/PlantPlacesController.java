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
	
	@RequestMapping("/start")
	public String Start() {
		
		return "start";
	}
	
	@RequestMapping("/")
	public String index() {
		
		return "start";
	}
}
