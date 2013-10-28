package de.kuebler.erp.crm.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class PitureStreamExampleController {

	 @RequestMapping(value = "/image/path/{id}/{imageName}", method = RequestMethod.GET)
	 public void streamPic(ModelMap model, 
			 HttpServletRequest request, HttpServletResponse response,
			 @PathVariable(value = "id") String hasseNichtgesehen,
			 @PathVariable String imageName){
		 doStream();
	 }
	 
	 
	 @RequestMapping(value = "**/*.jpg", method = RequestMethod.GET)
	 public void streamPicAnotherVersion(){
		 doStream();
	 }
	 
	 
	 private void doStream(){
		 System.out.println("nothing!");
	 }
}
