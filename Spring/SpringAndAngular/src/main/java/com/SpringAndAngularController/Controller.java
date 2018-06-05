
package com.SpringAndAngularController;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class Controller {
 
	@RequestMapping("/api/hi")
	public String hi() {
		return "Hello World It's my first steps with Restful API"; //Why it's not working on request?..
		//Oke i need to find mistake later. Or i made mistake when moving files from angular proj to resources
		//or when deployed spring boot serv with angular.
	}
}