package de.kuebler.erp.crm.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.kuebler.erp.crm.mvc.model.RequestModel;
import de.kuebler.erp.crm.service.BusinessLogicAndServices;


@Controller
public class MainController {
	
	
	private BusinessLogicAndServices exampleService;
	
	@Autowired
	public MainController(BusinessLogicAndServices exampleService){
		this.exampleService = exampleService;
	}
	
	@ModelAttribute("message")
	public String defaultMessage(){
		return this.exampleService.getDefaultExampleMessage();
	}
	
	@RequestMapping(value = "/testHomeRedirect" , method = RequestMethod.GET)
	public String doSomething(ModelMap model,
			@ModelAttribute("message") String defaultMessage){
		
		model.put("message", defaultMessage);
		
		model.put("something", "hallo");
		
		List<RequestModel> tmpList = this.exampleService.getDefaultRequestModel();
		
		this.exampleService.doSomethingDatabase();
		
		model.put("complexModel", tmpList);
		
		return "showMessage";
	}
	
	
	
	
}
